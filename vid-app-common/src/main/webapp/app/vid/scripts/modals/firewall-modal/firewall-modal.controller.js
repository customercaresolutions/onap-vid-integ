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

    appDS2.controller("firewallModalController",  ["$uibModalInstance",
        "$log", "$scope", firewallModalController]);

    function firewallModalController($uibModalInstance,  $log, $scope) {
        var vm = this;
        var init = function() {
          console.log("In init of firewallModalController");
		 $scope.isDialogVisible = true;
		 
		 $scope.service = "firewall.csar!/firewall/firewall_service.yaml";
		 $scope.cloud_type = "aws";
		 $scope.region_name = "us-east-1";
		 $scope.access_key_id = "AKIAX5SZYLZQL53OG6EI";
		 $scope.secret_access_key = "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";
		 $scope.selected_flavour = "simple";
		  $scope.image_id = "ami-0a0ddd875a1ea2c7f";
		 $scope.instance_type = "t2.large";
		 $scope.availability_zone = "us-east-1b";
		 $scope.ves_collector_ip = "Enter public IP VM where DMAAP is running";
		 $scope.ves_collector_port = "Enter port of DMAAP";
		 $scope.lower_threshold = 10;
		 $scope.upper_threshold = 80;
		 $scope.packet_rate = 20;
		 $scope.num_streams = 5;
		
		 $scope.identity_api_version = 2;
	    };

        vm.close = function () {
            $uibModalInstance.close();
        };

        vm.ok = function () {
			var result = {
				"cloud_type": $scope.cloud_type,
				"region_name": $scope.region_name,
				"access_key_id": $scope.access_key_id,
				"secret_access_key": $scope.secret_access_key,
				"selected_flavour": $scope.selected_flavour,
				"image_id": $scope.image_id,
				"instance_type": $scope.instance_type,
				"availability_zone": $scope.availability_zone,
				"ves_collector_ip": $scope.ves_collector_ip,
				"ves_collector_port": $scope.ves_collector_port,
				"msg_bus_type": "dmaap",
				"lower_threshold": $scope.lower_threshold,
				"upper_threshold": $scope.upper_threshold,
				"packet_rate": $scope.packet_rate,
				"num_streams": $scope.num_streams,
				"identity_api_version": $scope.identity_api_version,
			};
			var service = $scope.service;
            $uibModalInstance.close({result, service});
			//return params;
			
        };

        init();
    }
})();
