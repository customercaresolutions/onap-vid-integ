package org.onap.simulator.presetGenerator.presets.mso.changeManagement;

import org.onap.simulator.presetGenerator.presets.aai.PresetAAIGetCloudOwnersByCloudRegionId;
import org.springframework.http.HttpMethod;

public class PresetMsoVnfUpdate extends PresetMsoChangeManagementBase {


    public PresetMsoVnfUpdate(String serviceInstanceId, String vnfInstanceId) {
        super(serviceInstanceId, vnfInstanceId, "");
        this.cloudOwner = PresetAAIGetCloudOwnersByCloudRegionId.ATT_NC;
    }

    @Override
    public HttpMethod getReqMethod() {
        return HttpMethod.PUT;
    }

    @Override
    public String getReqPath() {
        return getRootPath() + "/serviceInstantiation/v./serviceInstances/" + serviceInstanceId + "/vnfs/" + vnfInstanceId;
    }

    @Override
    public Object getRequestBody() {
        return "{" +
                "  \"requestDetails\": {" +
                "   \"modelInfo\": {" +
                "      \"modelType\": \"vnf\"," +
                "      \"modelInvariantId\": \"ff5256d1-5a33-55df-13ab-12abad84e7ff\"," +
                "      \"modelVersionId\": \"254583ad-b38c-498b-bdbd-b8de5e07541b\"," +
                "      \"modelName\": \"vSAMP12\"," +
                "      \"modelVersion\": \"2.0\"," +
                // TODO Ask ZITELLA, MICHAEL V if the field is mandatory. Vid currently not send it
                //"      \"modelCustomizationName\": \"vSAMP12 1\"," +
                "      \"modelCustomizationId\": \"c539433a-84a6-4082-a12e-5c9b00c3b960\"" +
                "    }," +
                "    \"cloudConfiguration\": {" +
                "      \"lcpCloudRegionId\": \"mdt1\"," +
                        addCloudOwnerIfNeeded() +
                "      \"tenantId\": \"88a6ca3ee0394ade9403f075db23167e\"" +
                "    }," +
                "    \"requestInfo\": {" +
                "      \"source\": \"VID\"," +
                "      \"suppressRollback\": false," +
                "      \"requestorId\": \"az2016\"" +
                "    }," +
                "    \"relatedInstanceList\": [" +
                "      {" +
                "        \"relatedInstance\": {" +
                "          \"instanceId\": \""+serviceInstanceId+"\"," +
                "          \"modelInfo\": {" +
                "            \"modelType\": \"service\"," +
                "            \"modelInvariantId\": \"ff3514e3-5a33-55df-13ab-12abad84e7ff\"," +
                "            \"modelVersionId\": \"9ebb1521-2e74-47a4-aac7-e71a79f73a79\"," +
                "            \"modelName\": \"fakeModelName\"," +
                "            \"modelVersion\": \"2.0\"" +
                "          }" +
                "        }" +
                "      }" +
                "    ]," +
                "    \"requestParameters\": {" +
                "      \"usePreload\": true" +
                "    }" +
                "}}";
    }
}
