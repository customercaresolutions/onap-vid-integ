package org.onap.sdc.ci.tests.execute.setup;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.ExtentTest;
import com.github.markusbernhardt.proxy.ProxySearch;
import com.github.markusbernhardt.proxy.ProxySearch.Strategy;
import com.github.markusbernhardt.proxy.util.PlatformUtil;
import com.github.markusbernhardt.proxy.util.PlatformUtil.Platform;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import net.lightbody.bmp.BrowserMobProxyServer;

public class MobProxy {
	
	private static HashMap<Long, BrowserMobProxyServer> mobProxyServerMap = new HashMap<Long, BrowserMobProxyServer>();
	public static InetSocketAddress localProxyAddress = getProxy();	
	
	public static InetSocketAddress getProxy(){		
		setLogger();
	    
		ProxySearch proxySearch = new ProxySearch(); 
//		proxySearch.addStrategy(Strategy.JAVA); 
//		proxySearch.addStrategy(Strategy.BROWSER);
//		proxySearch.addStrategy(Strategy.OS_DEFAULT);
//		proxySearch.addStrategy(Strategy.ENV_VAR);
		if (PlatformUtil.getCurrentPlattform() == Platform.WIN) {
		    proxySearch.addStrategy(Strategy.IE);
		    proxySearch.addStrategy(Strategy.FIREFOX);
		    proxySearch.addStrategy(Strategy.JAVA);
		} else if (PlatformUtil.getCurrentPlattform() == Platform.LINUX) {
		    proxySearch.addStrategy(Strategy.GNOME);
		    proxySearch.addStrategy(Strategy.KDE);
		    proxySearch.addStrategy(Strategy.FIREFOX);
		    proxySearch.addStrategy(Strategy.ENV_VAR);
		    return null;
		} else {
		    proxySearch.addStrategy(Strategy.OS_DEFAULT);
		}
		ProxySelector proxySelector = proxySearch.getProxySelector(); 

		ProxySelector.setDefault(proxySelector); 
		URI home = URI.create("http://www.google.com"); 
		System.out.println("ProxySelector: " + proxySelector); 
		System.out.println("URI: " + home); 
		List<Proxy> proxyList = proxySelector.select(home); 
		String host = null;
		String port = null;
		if (proxyList != null && !proxyList.isEmpty()) { 
		 for (Proxy proxy : proxyList) { 
		   System.out.println(proxy); 
		   SocketAddress address = proxy.address(); 
		   if (address instanceof InetSocketAddress) { 
		     host = ((InetSocketAddress) address).getHostName(); 
		     port = Integer.toString(((InetSocketAddress) address).getPort()); 
		     System.setProperty("http.proxyHost", host); 
		     System.setProperty("http.proxyPort", port); 
		   } 
		 } 
		}
		InetSocketAddress address = new InetSocketAddress(host, Integer.parseInt(port));
		return address;
	}
    
	// set logger for all classes connected to MobProxy
	public static void setLogger() {
		LoggerContext lc = (LoggerContext) LoggerFactory. getILoggerFactory();
//	    lc.getLogger("ROOT").setLevel(Level.DEBUG);
		for(Logger logger:lc.getLoggerList()){
			logger.setLevel(Level.INFO);
		}
	}
	
	public static synchronized void setProxyServer() {
		BrowserMobProxyServer server = new BrowserMobProxyServer();
		server.setTrustAllServers(true);
		if (localProxyAddress != null){
			server.setChainedProxy(localProxyAddress);
			server.start();
		} else {
			server.start();
			// filter firefox requests to mozilla when system proxy is absent
			server.blacklistRequests(".*mozilla.*", 200);
		}		
		mobProxyServerMap.put(Thread.currentThread().getId(), server);       
	}
	
	public static synchronized BrowserMobProxyServer getPoxyServer() {
        return mobProxyServerMap.get(Thread.currentThread().getId());
    }	

}
