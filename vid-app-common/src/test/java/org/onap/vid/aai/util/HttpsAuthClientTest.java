/*-
 * ============LICENSE_START=======================================================
 * VID
 * ================================================================================
 * Copyright (C) 2017 - 2019 AT&T Intellectual Property. All rights reserved.
 * Modifications Copyright (C) 2018 - 2019 Nokia. All rights reserved.
 * ================================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=========================================================
 */

package org.onap.vid.aai.util;


import java.nio.file.FileSystems;
import org.mockito.Mock;

import org.onap.vid.aai.exceptions.HttpClientBuilderException;
import org.onap.vid.exceptions.GenericUncheckedException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.togglz.core.manager.FeatureManager;

import javax.net.ssl.SSLContext;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class HttpsAuthClientTest {
    @Mock
    private SystemPropertyHelper systemPropertyHelper;
    @Mock
    private SSLContextProvider sslContextProvider;
    @Mock
    private SSLContext sslContext;

    public static final String CERT_FILE_PATH = "any_path";

    private HttpsAuthClient createTestSubject() {
        return new HttpsAuthClient(CERT_FILE_PATH, systemPropertyHelper, sslContextProvider, mock(FeatureManager.class));
    }

    @BeforeMethod
    public void setUp() throws Exception {
        initMocks(this);
        when(systemPropertyHelper.getAAITruststoreFilename()).thenReturn(Optional.of("filename"));
        when(systemPropertyHelper.getAAIKeystoreFilename()).thenReturn(Optional.of("keystorefilename"));
        when(systemPropertyHelper.getDecryptedKeystorePassword()).thenReturn("password");
        when(systemPropertyHelper.getDecryptedTruststorePassword()).thenReturn("password");
    }

    @Test(expectedExceptions = {HttpClientBuilderException.class})
    public void testHttpClientBuilderExceptionOnGetClient() throws Exception {
        //when
        when(systemPropertyHelper.isClientCertEnabled()).thenReturn(true);
        when(sslContextProvider.getSslContext(anyString(), anyString(), any())).thenThrow(new HttpClientBuilderException(new GenericUncheckedException("msg")));
        createTestSubject().getClient(HttpClientMode.WITH_KEYSTORE);
    }

    @Test
    public void testGetSecuredClient() throws Exception {
        // when
        when(systemPropertyHelper.isClientCertEnabled()).thenReturn(true);
        when(sslContextProvider.getSslContext(anyString(), anyString(), any())).thenReturn(sslContext);
        createTestSubject().getClient(HttpClientMode.WITH_KEYSTORE);

        //then
        verify(sslContextProvider).getSslContext(anyString(), anyString(), any());
    }

    @Test
    public void getKeystorePath_whenNotConfigured_yieldEmptyString() {
        // when
        when(sslContextProvider.getSslContext(anyString(), anyString(), any())).thenReturn(sslContext);

        //then
        assertThat(createTestSubject().getKeystorePath()).isEqualTo(CERT_FILE_PATH + FileSystems.getDefault().getSeparator() + "keystorefilename");
    }

    @Test
    public void getKeystorePath_whenConfigured_yieldPathAndFile() {
        // when
        when(systemPropertyHelper.getAAIKeystoreFilename()).thenReturn(Optional.empty());

        //then
        assertThat(createTestSubject().getKeystorePath()).isEqualTo("");
    }

    @Test
    public void getKeystorePath_whenConfiguredWithSlash_yieldFilenameWithoutPath() {
        // when
        final String filenameWithSlash = "/path/to/keystorefilename";
        when(systemPropertyHelper.getAAIKeystoreFilename()).thenReturn(Optional.of(filenameWithSlash));

        //then
        assertThat(createTestSubject().getKeystorePath()).isEqualTo(filenameWithSlash);
    }

    @Test
    public void testGetUnsecuredClient() throws Exception {
        // when
        when(systemPropertyHelper.isClientCertEnabled()).thenReturn(false);
        createTestSubject().getClient(HttpClientMode.WITH_KEYSTORE);

        //then
        verify(sslContextProvider, never()).getSslContext(anyString(), anyString(), any());
    }
}
