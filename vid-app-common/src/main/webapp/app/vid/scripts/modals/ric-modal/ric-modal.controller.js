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

    appDS2.controller("ricModalController",  ["$uibModalInstance",
        "$log", "$scope", ricModalController]);

    function ricModalController($uibModalInstance,  $log, $scope) {
        var vm = this;
        var init = function() {
          console.log("In init of ricModalController");
		 $scope.isDialogVisible = true;
		 
		 $scope.service = "ric.csar!/ric/ric.yaml";
		 $scope.helm_version = "2.17.0";
	    };

        vm.close = function () {
            $uibModalInstance.close();
        };

        vm.ok = function () {
			var result = {
				"helm_version": $scope.helm_version,
			};
			var service = $scope.service;
            $uibModalInstance.close({result, service});
			//return params;
        };
        init();
    }
})();