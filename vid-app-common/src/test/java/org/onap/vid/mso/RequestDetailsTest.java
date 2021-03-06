/*-
 * ============LICENSE_START=======================================================
 * VID
 * ================================================================================
 * Copyright (C) 2017 - 2019 AT&T Intellectual Property. All rights reserved.
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

package org.onap.vid.mso;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.onap.vid.exceptions.NotFoundException;
import org.onap.vid.mso.rest.RequestDetails;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class RequestDetailsTest {

    private static final ImmutableList<String> LCP_CLOUD_REGION_ID_PATH = ImmutableList.of("requestDetails", "cloudConfiguration", "lcpCloudRegionId");

    @DataProvider
    public static Object[][] extractValueByPathDataProvider() {

        RequestDetails requestDetails1 = new RequestDetails();
        Map cloudConfiguration = ImmutableMap.of("lcpCloudRegionId", "lcp1");
        requestDetails1.setAdditionalProperty("requestDetails",
                                                ImmutableMap.of("cloudConfiguration", cloudConfiguration));


        return new Object[][] {
                { requestDetails1, LCP_CLOUD_REGION_ID_PATH, String.class, "lcp1" },
                { requestDetails1, ImmutableList.of("requestDetails", "cloudConfiguration"), Map.class, cloudConfiguration },

        };
    }

    @Test(dataProvider = "extractValueByPathDataProvider")
    public void testExtractValueByPath(RequestDetails requestDetails, List<String> keys, Class clz, Object expectedValue) {
        assertEquals(expectedValue, requestDetails.extractValueByPathUsingAdditionalProperties(keys, clz));
    }

    @DataProvider
    public static Object[][] extractValueByPathDataProviderThrowException() {
        RequestDetails requestDetails1 = new RequestDetails();
        requestDetails1.setAdditionalProperty("requestDetails",
                ImmutableMap.of("cloudConfiguration", "notMap"));

        RequestDetails requestDetails2 = new RequestDetails();
        requestDetails2.setAdditionalProperty("requestDetails",
                ImmutableMap.of("cloudConfiguration", Collections.EMPTY_MAP));

        return new Object[][] {
                { new RequestDetails(), LCP_CLOUD_REGION_ID_PATH, String.class},
                { requestDetails1, LCP_CLOUD_REGION_ID_PATH, String.class},
                { requestDetails1, ImmutableList.of("requestDetails", "abc"), String.class},
                { requestDetails2, LCP_CLOUD_REGION_ID_PATH, String.class},
        };
    }

    @Test(dataProvider = "extractValueByPathDataProviderThrowException", expectedExceptions = NotFoundException.class)
    public void testExtractValueByPathThrowException(RequestDetails requestDetails, List<String> keys, Class clz) {
        requestDetails.extractValueByPathUsingAdditionalProperties(keys, clz);
    }
}
