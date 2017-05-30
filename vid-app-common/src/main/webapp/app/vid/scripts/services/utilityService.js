/*-
 * ============LICENSE_START=======================================================
 * VID
 * ================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property. All rights reserved.
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

"use strict";

/*
 * "UtilityService" contains various generic methods.
 * 
 * (*** DEPRECATED - Use PropertyService instead ***) setProperties() and
 * getProperties()
 * 
 * SYNTAX: hasContents(object)
 * 
 * Returns "true" if "object" contains contents (i.e. is NOT undefined, null or
 * ""), "false" otherwise.
 * 
 * SYNTAX: checkUndefined(name, value)
 * 
 * Throws an exception if "value" is undefined. The exception includes "name" as
 * the cause of the exception. Returns "value" if it is defined.
 * 
 * SYNTAX: getCurrentTime()
 * 
 * Returns the current local date and time in the format "MM/DD/YY HH:MM:SS"
 * 
 * SYNTAX: setHttpErrorHandler(function)
 * 
 * Sets the HTTP error handler to "function".
 * 
 * SYNTAX: runHttpErrorHandler(response, status)
 * 
 * Logs warning messages and the runs the HTTP error handler previously set by
 * "setHttpErrorHandler". The intended usage is for "$http" calls. Example:
 * $http.get(...).then(...)["catch"](UtilityService.runHttpErrorHandler);
 * 
 * SYNTAX: getHttpStatusText(statusCode)
 * 
 * Expects "statusCode" to be an HTTP response code (e.g. 404). The function
 * returns a string that includes both the code and an equivalent text summary.
 * Example: "Not found (404)"
 * 
 * SYNTAX: getHttpErrorMessage(response)
 * 
 * Expects "response" to be the response object generated by a "$http" error
 * condition. "getHttpErrorMessage" examines the object and returns a summary
 * string for some known conditions.
 */

var UtilityService = function($log, DataService, PARAMETER) {

    var _this = this;
    var convertModel = function (serviceModel) {
		
		var isNewFlow = false;
		
		for (var networkCustomizationName in serviceModel.networks) {
			var networkModel = serviceModel.networks[networkCustomizationName];
			if ( networkModel.customizationUuid != null ) {
				isNewFlow = true;
				break;
			}
		}
		if ( !isNewFlow ) {
			for (var vnfCustomizationName in serviceModel.vnfs) {
				var vnfModel = serviceModel.vnfs[vnfCustomizationName];
				if ( vnfModel.customizationUuid != null ) {
					isNewFlow = true;
					break;
				}
			}
		}
		if ( isNewFlow ) {
			return (convertNewModel (serviceModel) );
		}
		else {
			return (convertOldModel (serviceModel) );
		}
    };
    var convertNewModel = function (serviceModel ) {
    	var completeResources = new Array();
		var resource = {};
		var convertedAsdcModel = {
				"service": serviceModel.service,
				"networks": {},
				"vnfs": {},
				"completeDisplayInputs": {},
				"isNewFlow": true
			};
		var networkModelDisplayInputs = {};
		var vnfModelDisplayInputs = {};
    	for (var networkCustomizationName in serviceModel.networks) {
			var networkModel = serviceModel.networks[networkCustomizationName];
			
			convertedAsdcModel.networks[networkModel.customizationUuid] = {
					"uuid": networkModel.uuid,
					"invariantUuid": networkModel.invariantUuid,
					"version": networkModel.version,
					"name": networkModel.name,
					"modelCustomizationName": networkModel.modelCustomizationName,
					"customizationUuid": networkModel.customizationUuid,
					"inputs": "",
					"description": networkModel.description,
					"commands": {},
					"displayInputs": {}
			}
			resource = {
					"name": networkModel.modelCustomizationName,
					"description": networkModel.description
			};
			completeResources.push (resource);
			
			if (networkModel.commands != null) {
				/*
				 * commands: 
				 *  internal_net_param_ntu: {
				 * 		command: get_input,
				 * 		displaName: internal_net_param_ntu,
				 * 		inputName: vccfd1_internal_net_param_ntu // pointer to input key
				 * }
				 * If the input name (ptr) is one of instance_node_target,  naming_policy or vf_instance_name
				 * then ignore it
				 * 
				 */
				
				for ( var cmd in networkModel.commands ) {
					var cmdObj = networkModel.commands[cmd];
					if ( cmdObj.inputName != null ) {
						switch (cmdObj.inputName) {
							case "instance_node_target":
								break;
							case "naming_policy":
								break;
							case "vf_instance_name":
								break;
							default: 
								if (serviceModel.service != null && serviceModel.service.inputs != null &&
										serviceModel.service.inputs[cmdObj.inputName] != null ) {
									networkModelDisplayInputs[cmdObj.inputName] = (serviceModel.service.inputs[cmdObj.inputName]);
									networkModelDisplayInputs[cmdObj.inputName][PARAMETER.DISPLAY_NAME] = cmdObj.displayName;
								}
						}
								
					}
					
				}
				convertedAsdcModel.networks[networkModel.customizationUuid].displayInputs=networkModelDisplayInputs;
				
			}
		}
		
		for (var vnfCustomizationName in serviceModel.vnfs) {
			var vnfModel = serviceModel.vnfs[vnfCustomizationName];
			var vnfCustomizationUuid = vnfModel.customizationUuid;
			convertedAsdcModel.vnfs[vnfModel.customizationUuid] = {
					"uuid": vnfModel.uuid,
					"invariantUuid": vnfModel.invariantUuid,
					"version": vnfModel.version,
					"name": vnfModel.name,
					"modelCustomizationName": vnfModel.modelCustomizationName,
					"customizationUuid": vnfModel.customizationUuid,
					"inputs": "",
					"description": vnfModel.description,
					"vfModules": {},
					"volumeGroups": {},
					"commands": {},
					"displayInputs": {},
					"properties": {},
					"nfRole": "",
					"nfType": ""
			}
			
			resource = {
					"name": vnfModel.modelCustomizationName,
					"description": vnfModel.description
			};
			completeResources.push (resource);
			
			if (vnfModel.commands != null) {
				/*
				 * commands: {
				 *  internal_net_param_ntu: {
				 * 		command: get_input,
				 * 		displaName: internal_net_param_ntu,
				 * 		inputName: vccfd1_internal_net_param_ntu // pointer to input key
				 * }
				 * If the input name (ptr) is one of instance_node_target,  naming_policy or vf_instance_name
				 * then ignore it
				 * 
				 */
				
				for ( var cmd in vnfModel.commands ) {
					var cmdObj = vnfModel.commands[cmd];
					if ( cmdObj.inputName != null ) {
						// To Do: Make this list configurable
						switch (cmdObj.inputName) {
							case "instance_node_target":
								break;
							case "naming_policy":
								break;
							case "vf_instance_name":
								break;
							default: 
								if (serviceModel.service != null && serviceModel.service.inputs != null &&
										serviceModel.service.inputs[cmdObj.inputName] != null ) {
									vnfModelDisplayInputs[cmdObj.inputName] = (serviceModel.service.inputs[cmdObj.inputName]);
									vnfModelDisplayInputs[cmdObj.inputName][PARAMETER.DISPLAY_NAME] = cmdObj.displayName;
								}
						}
								
					}
					
				}
				
				convertedAsdcModel.vnfs[vnfCustomizationUuid].displayInputs=vnfModelDisplayInputs;
				convertedAsdcModel.vnfs[vnfCustomizationUuid].properties=vnfModel.properties;
				//
				var vnf_type = "";
				var vnf_role = "";
				var vnf_function = "";
				var vnf_code = "";
				if ( !( isObjectEmpty(vnfModel.properties) ) ) {
					if (hasContents (vnfModel.properties.nf_type) ) {
						vnf_type = vnfModel.properties.nf_type;
					}
					if (hasContents (vnfModel.properties.nf_role) ) {
						vnf_role = vnfModel.properties.nf_role;
					}
					if (hasContents (vnfModel.properties.nf_function) ) {
						vnf_function = vnfModel.properties.nf_function;
					}
					if (hasContents (vnfModel.properties.nf_naming_code) ) {
						vnf_code = vnfModel.properties.nf_naming_code;
					}
				}
				convertedAsdcModel.vnfs[vnfCustomizationUuid]["nfType"] = vnf_type;
				convertedAsdcModel.vnfs[vnfCustomizationUuid]["nfRole"] = vnf_role;
				convertedAsdcModel.vnfs[vnfCustomizationUuid]["nfFunction"] = vnf_function;
				convertedAsdcModel.vnfs[vnfCustomizationUuid]["nfCode"] = vnf_code;
				//
				for (var vfModuleCustomizationName in serviceModel.vnfs[vnfCustomizationName].vfModules) {
					var vfModuleModel = serviceModel.vnfs[vnfCustomizationName].vfModules[vfModuleCustomizationName];
					convertedAsdcModel.vnfs[vnfCustomizationUuid].vfModules[vfModuleModel.customizationUuid] = vfModuleModel;
				}
				
				for (var volumeGroupCustomizationName in serviceModel.vnfs[vnfCustomizationName].volumeGroups) {
					var volumeGroupModel = serviceModel.vnfs[vnfCustomizationName].volumeGroups[volumeGroupCustomizationName];
					convertedAsdcModel.vnfs[vnfCustomizationUuid].volumeGroups[volumeGroupModel.customizationUuid] = volumeGroupModel;
				}
			}
		}
		
		var completeDisplayInputs = {};
		
		for (var key in vnfModelDisplayInputs) {
			completeDisplayInputs[key] = vnfModelDisplayInputs[key];
		}
		for (var key in networkModelDisplayInputs) {
			completeDisplayInputs[key] = networkModelDisplayInputs[key];
		}
		
		convertedAsdcModel.completeDisplayInputs = completeDisplayInputs;
		// Need to collect all the model customization names (node template tag) and descriptions
		DataService.setResources (completeResources);
		
		console.log ("convertedAsdcModel: "); console.log (JSON.stringify ( convertedAsdcModel, null, 4 ));
		return (convertedAsdcModel);
    };
    
    var convertOldModel = function (serviceModel ) {
    	
		var resource = {};
		var convertedAsdcModel = {
				"service": serviceModel.service,
				"networks": {},
				"vnfs": {},
				"completeDisplayInputs": {},
				"isNewFlow": false
			};
		var completeResources = new Array();
		var resource = {};
		var vnfModelDisplayInputs = {};
		var networkModelDisplayInputs = {};
		for (var networkCustomizationName in serviceModel.networks) {
			var networkModel = serviceModel.networks[networkCustomizationName];
			convertedAsdcModel.networks[networkModel.invariantUuid] = {};
			//convertedAsdcModel.networks[networkModel.invariantUuid][networkModel.version] = networkModel;
			// need a network model to test this
			convertedAsdcModel.networks[networkModel.uuid] = {
					"uuid": networkModel.uuid,
					"invariantUuid": networkModel.invariantUuid,
					"version": networkModel.version,
					"name": networkModel.name,
					"modelCustomizationName": networkModel.modelCustomizationName,
					"customizationUuid": networkModel.customizationUuid,
					"inputs": "",
					"description": networkModel.description,
					"commands": {},
					"displayInputs": {}
			}
			resource = {
					"name": networkModel.modelCustomizationName,
					"description": networkModel.description
			};
			completeResources.push (resource);
			if (networkModel.commands != null) {
				/*
				 * commands: 
				 *  internal_net_param_ntu: {
				 * 		command: get_input,
				 * 		displaName: internal_net_param_ntu,
				 * 		inputName: vccfd1_internal_net_param_ntu // pointer to input key
				 * }
				 * If the input name (ptr) is one of instance_node_target,  naming_policy or vf_instance_name
				 * then ignore it
				 * 
				 */
				
				for ( var cmd in networkModel.commands ) {
					var cmdObj = networkModel.commands[cmd];
					if ( cmdObj.inputName != null ) {
						switch (cmdObj.inputName) {
							case "instance_node_target":
								break;
							case "naming_policy":
								break;
							case "vf_instance_name":
								break;
							default: 
								if (serviceModel.service != null && serviceModel.service.inputs != null &&
										serviceModel.service.inputs[cmdObj.inputName] != null ) {
									networkModelDisplayInputs[cmdObj.inputName] = (serviceModel.service.inputs[cmdObj.inputName]);
									networkModelDisplayInputs[cmdObj.inputName][PARAMETER.DISPLAY_NAME] = cmdObj.displayName;
								}
						}
								
					}
					
				}
				convertedAsdcModel.networks[networkModel.uuid].displayInputs=networkModelDisplayInputs;
			}
		}
		
		for (var vnfCustomizationName in serviceModel.vnfs) {
			var vnfModel = serviceModel.vnfs[vnfCustomizationName];
			convertedAsdcModel.vnfs[vnfModel.uuid] = {
					"uuid": vnfModel.uuid,
					"invariantUuid": vnfModel.invariantUuid,
					"version": vnfModel.version,
					"name": vnfModel.name,
					"modelCustomizationName": vnfModel.modelCustomizationName,
					"customizationUuid": vnfModel.customizationUuid,
					"inputs": "",
					"description": vnfModel.description,
					"vfModules": {},
					"volumeGroups": {},
					"commands": {},
					"displayInputs": {}
			}
			resource = {
					"name": vnfModel.modelCustomizationName,
					"description": vnfModel.description
			};
			completeResources.push (resource);
			
			if (vnfModel.commands != null) {
				/*
				 * commands: {
				 *  internal_net_param_ntu: {
				 * 		command: get_input,
				 * 		displaName: internal_net_param_ntu,
				 * 		inputName: vccfd1_internal_net_param_ntu // pointer to input key
				 * }
				 * If the input name (ptr) is one of instance_node_target,  naming_policy or vf_instance_name
				 * then ignore it
				 * 
				 */
				
				for ( var cmd in vnfModel.commands ) {
					var cmdObj = vnfModel.commands[cmd];
					if ( cmdObj.inputName != null ) {
						// To Do: Make this list configurable
						switch (cmdObj.inputName) {
							case "instance_node_target":
								break;
							case "naming_policy":
								break;
							case "vf_instance_name":
								break;
							default: 
								if (serviceModel.service != null && serviceModel.service.inputs != null &&
										serviceModel.service.inputs[cmdObj.inputName] != null ) {
									vnfModelDisplayInputs[cmdObj.inputName] = (serviceModel.service.inputs[cmdObj.inputName]);
									vnfModelDisplayInputs[cmdObj.inputName][PARAMETER.DISPLAY_NAME] = cmdObj.displayName;
								}
						}
								
					}
					
				}
				convertedAsdcModel.vnfs[vnfModel.uuid].displayInputs=vnfModelDisplayInputs;
			}
			
			for (var vfModuleCustomizationName in serviceModel.vnfs[vnfCustomizationName].vfModules) {
				var vfModuleModel = serviceModel.vnfs[vnfCustomizationName].vfModules[vfModuleCustomizationName];
				convertedAsdcModel.vnfs[vnfModel.uuid].vfModules[vfModuleModel.uuid] = vfModuleModel;
			}
			
			for (var volumeGroupCustomizationName in serviceModel.vnfs[vnfCustomizationName].volumeGroups) {
				var volumeGroupModel = serviceModel.vnfs[vnfCustomizationName].volumeGroups[volumeGroupCustomizationName];
				convertedAsdcModel.vnfs[vnfModel.uuid].volumeGroups[volumeGroupModel.uuid] = volumeGroupModel;
			}
		}
		//console.log ("convertedAsdcModel: "); console.log (JSON.stringify ( convertedAsdcModel, null, 4 ) );
		
		var completeDisplayInputs = {};
		
		for (var key in vnfModelDisplayInputs) {
			completeDisplayInputs[key] = vnfModelDisplayInputs[key];
		}
		for (var key in networkModelDisplayInputs) {
			completeDisplayInputs[key] = networkModelDisplayInputs[key];
		}
		
		convertedAsdcModel.completeDisplayInputs = completeDisplayInputs;
		// Need to collect all the model customization names (node template tag) and descriptions
		DataService.setResources (completeResources);
		console.log ("convertedAsdcModel: "); console.log (JSON.stringify ( convertedAsdcModel, null, 4 ));
		return (convertedAsdcModel);
    };
    
    function hasContents(object) {
	if (object === undefined || object === null || object === "") {
	    return false;
	}
	return true;
    };
    function isObjectEmpty(o) {
		var len = 0;
		if (hasContents(o)){
			var keys = Object.keys(o);
			len = keys.length;
			if ( len == 0 ) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return true;
		}
    };
    function padZero(number) {
	if (number < 10) {
	    return "0" + number;
	} else {
	    return "" + number;
	}
    };

    var httpErrorHandler = function(response, status) {
	$log.warn("UtilityService:httpErrorHandler: response:");
	$log.warn(response);
	$log.warn("UtilityService:httpErrorHandler: status:");
	$log.warn(status);
	if (angular.isFunction(_this.httpErrorHandler)) {
	    _this.httpErrorHandler(response, status);
	}
    };

    var startNextAsyncOperation = function() {
	if (_this.asyncOperations.count < _this.asyncOperations.operationList.length) {
	    _this.asyncOperations.operationList[_this.asyncOperations.count++]
		    ();
	} else {
	    if (angular.isFunction(_this.asyncOperations.callbackFunction)) {
		_this.asyncOperations.callbackFunction();
	    }
	}
    };

    return {
	setProperties : function(properties) {
	    _this.properties = properties;
	},
	getProperties : function() {
	    return _this.properties;
	},
	hasContents : hasContents,
	checkUndefined : function(name, value) {
	    if (value === undefined) {
		throw {
		    type : "undefinedObject",
		    message : "undefined object: \"" + name + "\""
		};
	    }
	    return value;
	},
	jsonConcat : function (o1, o2) {
		 for (var key in o2) {
		  o1[key] = o2[key];
		 }
		 return o1;
   },
	getCurrentTime : function() {
	    var time = new Date();
	    return padZero(time.getMonth() + 1) + "/"
		    + padZero(time.getDate()) + "/"
		    + (time.getFullYear() - 2000) + " "
		    + padZero(time.getHours()) + ":"
		    + padZero(time.getMinutes()) + ":"
		    + padZero(time.getSeconds())
	},
	getHttpStatusText : function(statusCode) {
	    var statusMap = {
		"200" : "OK",
		"201" : "Created",
		"202" : "Accepted",
		"400" : "Bad Request",
		"401" : "Unauthorized",
		"404" : "Not Found",
		"405" : "Method Not Allowed",
		"409" : "Locked",
		"500" : "Internal Server Error",
		"503" : "Service Unavailable",
		"504" : "Gateway Timeout"
	    }

	    if (status === undefined) {
		return "Undefined";
	    }

	    var statusText = statusMap[statusCode];
	    if (statusText === undefined) {
		statusText = "Unknown";
	    }

	    return statusText + " (" + statusCode + ")";
	},
	getHttpErrorMessage : function(response) {
	    var data = response.data;
	    if (response.status === 500 && hasContents(data.exception)) {
		var summary = "exception: " + data.exception;
		if (hasContents(data.message)) {
		    summary += " message: " + data.message;
		}
		return summary;
	    }
	    if (response.status === 0 && response.statusText === "") {
		/*
		 * This logic is somewhat "fuzzy". Potential (brainstorming)
		 * enhancements if users find the message unreliable include:
		 * 
		 * A) SERVER TIMEOUT: perhaps a newer version of Angular can
		 * reliably determine timeouts.
		 * 
		 * B) SERVER TIMEOUT: recording start / end times and using that
		 * to determine if timeout occured
		 * 
		 * C) SESSION TIMEOUT "Potentially" examine cookies, although
		 * that may not be feasible if cookies are set to "httponly".
		 */
		if (data === null) {
		    //return "possible server timeout";
			return "VID has timed out waiting for a response. To see status, close this popup and the screen will be refreshed automatically";
		}
		if (data === "") {
		    return "Possible reasons include a session timeout or a server issue. "
			    + "A session timeout might be resolved by refreshing the screen and re-logging in";
		}
	    }
	    var summary = "";
	    if (response.status !== undefined && response.status > 0) {
		summary = "status: " + response.status;
	    }
	    if (hasContents(response.statusText)) {
		if (summary !== "") {
		    summary += " ";
		}
		summary += "message: " + response.statusText;
	    }
	    return summary;
	},
	setHttpErrorHandler : function(httpErrorHandler) {
	    _this.httpErrorHandler = httpErrorHandler;
	},
	runHttpErrorHandler : function(response, status) {
	    httpErrorHandler(response, status);
	},
	startAsyncOperations : function(operationList, callbackFunction) {
	    for (var i = 0; i < operationList.length; i++) {
		if (!angular.isFunction(operationList[i])) {
		    throw "UtilityService:startAsyncOperations: invalid function: index: "
			    + i;
		}
	    }
	    _this.asyncOperations = {
		operationList : operationList,
		callbackFunction : callbackFunction,
		count : 0
	    };
	    startNextAsyncOperation();
	},
	startNextAsyncOperation : startNextAsyncOperation,
	stopAsyncOperations : function() {
	    _this.asyncOperations.count = _this.asyncOperations.operationList.length;
	},
	isObjectEmpty : isObjectEmpty,
	convertModel : convertModel,
	convertNewModel : convertNewModel,
	convertOldModel : convertOldModel,
	arrayContains : function (a, obj) {
	    var i = a.length;
	    if ( i > 0 ) {
		    while (i--) {
		       if (a[i] === obj) {
		           return true;
		       }
		    }
	    }
	    return false;
	}
	}
}

//app.factory("UtilityService", UtilityService);
appDS2.factory("UtilityService", [ "$log", "DataService", "PARAMETER", UtilityService ]);
