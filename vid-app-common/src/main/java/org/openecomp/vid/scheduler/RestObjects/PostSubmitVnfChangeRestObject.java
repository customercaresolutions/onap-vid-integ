package org.openecomp.vid.scheduler.RestObjects;

public class PostSubmitVnfChangeRestObject<T> extends RestObject<T> {
	
	public String uuid;
	
	public void setUUID(String uuid) { this.uuid = uuid; }
	    
	public String getUUID() { return this.uuid; }
}