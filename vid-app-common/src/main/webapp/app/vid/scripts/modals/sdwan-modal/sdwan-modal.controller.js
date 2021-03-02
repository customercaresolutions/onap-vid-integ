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

(function () {
    'use strict';

    appDS2.controller("sdwanModalController",  ["$uibModalInstance",
        "$log", "$scope", sdwanModalController]);

    function sdwanModalController($uibModalInstance,  $log, $scope) {
        var vm = this;
        var init = function() {
          console.log("In init of sdwanModalController");
		 $scope.isDialogVisible = true;
		 
		 $scope.service = "sdwan.csar!/sdwan/sdwan_service.yaml";
		 $scope.cloud_type = "aws";
		 $scope.region_name = "us-west-1";
		 $scope.availability_zone = "us-west-1c";
		 $scope.access_key_id = "AKIAX5SZYLZQL53OG6EI";
		 $scope.secret_access_key = "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";
		 $scope.instance_type = "c5d.xlarge";
		 $scope.image_id = "ami-0d705db840ec5f0c5";
		 $scope.identity_api_version = 3;
		 
		 $scope.site1_site_name = "SDWAN_Site_A";
		 $scope.site1_network_name = "siteA_network";
		 $scope.site1_cidr = "172.19.0.0/16";
		 $scope.site1_wan_subnet_name = "siteA_wan_subnet";
		 $scope.site1_wan_cidr = "172.19.254.0/24";
		 $scope.site1_lan_subnet_name = "siteA_lan_subnet";
		 $scope.site1_lan_cidr = "172.19.1.0/24";
		 
		 $scope.site2_site_name = "SDWAN_Site_B";
		 $scope.site2_network_name = "siteB_network";
		 $scope.site2_cidr = "172.14.0.0/16";
		 $scope.site2_wan_subnet_name = "siteB_wan_subnet";
		 $scope.site2_wan_cidr = "172.14.254.0/24";
		 $scope.site2_lan_subnet_name = "siteB_lan_subnet";
		 $scope.site2_lan_cidr = "172.14.1.0/24";
	    };

        vm.close = function () {
            $uibModalInstance.close();
        };

        vm.ok = function () {
			var result = {
				"cloud_type": $scope.cloud_type,
				"region_name": $scope.region_name,
				"availability_zone": $scope.availability_zone,
				"access_key_id": $scope.access_key_id,
				"secret_access_key": $scope.secret_access_key,
				"instance_type": $scope.instance_type,
				"image_id": $scope.image_id,
				"identity_api_version": $scope.identity_api_version,
				"SdwanSiteData":[
					{
						"site_name": $scope.site1_site_name,
						"network_name": $scope.site1_network_name,
						"cidr": $scope.site1_cidr,
						"wan_subnet_name": $scope.site1_wan_subnet_name,
						"wan_cidr": $scope.site1_wan_cidr,
						"lan_subnet_name": $scope.site1_lan_subnet_name,
						"lan_cidr": $scope.site1_lan_cidr,
					},
					{
						"site_name": $scope.site2_site_name,
						"network_name": $scope.site2_network_name,
						"cidr": $scope.site2_cidr,
						"wan_subnet_name": $scope.site2_wan_subnet_name,
						"wan_cidr": $scope.site2_wan_cidr,
						"lan_subnet_name": $scope.site2_lan_subnet_name,
						"lan_cidr": $scope.site2_lan_cidr,
					}
				]				
			};
			var service = $scope.service;
            $uibModalInstance.close({result, service});
			//return params;
			
        };

        init();
    }
})();
