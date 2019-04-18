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

package org.onap.vid.controller.open;

import org.onap.vid.controller.open.VersionController;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class VersionControllerTest {

    @DataProvider
    public static Object[][] majorVersionContainer() {
        return new Object[][]{
                {"features.properties", "1.0.2000", "features.properties.2000"},
                {"", "1.0.2000", ".2000"},
                {"kuku", "1.0.2000", "kuku.2000"},
                {"/kuku", "1.0.2000", "kuku.2000"},
                {"1810p.features.properties", "1.0.2000", "1810p.2000"},
                {"/opt/app/dev.features.properties", "1.0.2000", "dev.2000"},
                {"foo", "2000", "foo.2000"},
        };
    }

    final VersionController versionController = new VersionController(null);

    @Test(dataProvider = "majorVersionContainer")
    public void testGetDisplayVersion(String majorVersionContainer, String buildNumberContainer, String expected) {
        assertThat(versionController.getDisplayVersion(majorVersionContainer, buildNumberContainer), is(expected));
    }
}