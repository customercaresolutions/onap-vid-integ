package org.onap.simulator.presetGenerator.presets.aai;

import com.google.common.collect.ImmutableList;

public class PresetAAIModelsByInvariantIdGetForServiceWithCR extends PresetAAIModelsByInvariantIdGet {
    public PresetAAIModelsByInvariantIdGetForServiceWithCR(ImmutableList<String> modelInvariantIds) {
        super(modelInvariantIds);
    }

    @Override
    public Object getResponseBody() {
        return "{" +
                "  \"model\": [{" +
                "      \"model-invariant-id\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"," +
                "      \"model-type\": \"service\"," +
                "      \"resource-version\": \"1534274421300\"," +
                "      \"model-vers\": {" +
                "        \"model-ver\": [{" +
                "            \"model-version-id\": \"a92f899d-a3ec-465b-baed-1663b0a5aee1\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"3.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1534788756086\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"901e2641-c66c-4178-a6e8-cbe2877b0a2a\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534463243387\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"d2fda667-e92e-4cfa-9620-5da5de01a319\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"1.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1534444087221\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"d291ed5e-4f50-4f57-956d-ce0e67a059e5\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534274421311\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"d4a447e5-9791-47b9-b365-1abb19b4b626\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"4.0\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1534863624237\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"0ef29f1f-836a-4fab-986c-5f1b96310a3d\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534863624242\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"0e97a118-b1b6-40d5-bbad-98cdd51b1c48\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"11.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1550783120267\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"0ea8ac21-64b8-4489-9d62-12e625d66995\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1543961990189\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"46093d8f-6dfa-4332-9c00-7e822c681b59\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"7.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1534885144462\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"d74a5dff-ef7f-4e32-9c13-d82fb2c617c9\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534885014144\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"12930bcc-5276-42bb-8ed6-1e43d7acae2c\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"10.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1539613511543\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"4d57798e-81b7-490e-bee8-48bd382a1349\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1539613450903\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"f8783bb2-6135-4c35-8320-64fa7deae76b\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"2.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1534450229751\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"c666f1dd-99ff-442a-9ba2-1ee2dabb9e25\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534450167963\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"0148e4c5-629b-4fef-9728-1e13fd630679\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"9.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1537901614540\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"6ae6fd91-2086-470d-8c36-9d668c41fd32\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1537882880185\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"1ceab842-7ded-49f1-a129-dce2ecef8c71\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"6.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1534883213652\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"5ca853fc-2984-45c7-b2e7-8514a56785ba\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534883154090\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"fd21f6b5-02f6-4ac0-9515-e1f01112da95\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"5.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1534872246413\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"0812b47d-7ef1-4a65-b6fb-9f3ff3bc3eee\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534872174141\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"6e0bec91-09f3-43aa-9cf3-e617cd0146be\"," +
                "            \"model-name\": \"NCM_VLAN_SVC_ym161f\"," +
                "            \"model-version\": \"8.0\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"model-description\": \"Network Collection service for vLAN tagging\"," +
                "            \"resource-version\": \"1536098608209\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"a0247d2e-3843-4753-be2f-4c252c99390e\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1536098548388\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/82194af1-3c2c-485a-8f44-420e22a9eaa4/model-vers/model-ver/46b92144-923a-4d20-b85a-3cbd847668a9\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"82194af1-3c2c-485a-8f44-420e22a9eaa4\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"46b92144-923a-4d20-b85a-3cbd847668a9\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"service-instance\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }" +
                "        ]" +
                "      }" +
                "    }, {" +
                "      \"model-invariant-id\": \"868b109c-9481-4a18-891b-af974db7705a\"," +
                "      \"model-type\": \"resource\"," +
                "      \"resource-version\": \"1534795610752\"," +
                "      \"model-vers\": {" +
                "        \"model-ver\": [{" +
                "            \"model-version-id\": \"dd182d7d-6949-4b90-b3cc-5befe400742e\"," +
                "            \"model-name\": \"ncm_vlan_ym161f..NetworkCollection..0\"," +
                "            \"model-version\": \"1\"," +
                "            \"distribution-status\": \"DISTRIBUTION_COMPLETE_OK\"," +
                "            \"resource-version\": \"1534795610763\"" +
                "          }, {" +
                "            \"model-version-id\": \"e5fc56b7-e14c-45e5-b127-978c36a921c0\"," +
                "            \"model-name\": \"ncm_vlan_ym161f..NetworkCollection..0\"," +
                "            \"model-version\": \"1\"," +
                "            \"resource-version\": \"1543961989136\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"9001ff96-1142-49c6-af5b-df4e2b23a305\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1543961989136\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/3bf1e610-45f7-4ad6-b833-ca4c5ee6a3fd/model-vers/model-ver/8e6ee9dc-9017-444a-83b3-219edb018128\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"3bf1e610-45f7-4ad6-b833-ca4c5ee6a3fd\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"8e6ee9dc-9017-444a-83b3-219edb018128\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"instance-group\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }," +
                "            \"relationship-list\": {" +
                "              \"relationship\": [{" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/081ceb56-eb71-4566-a72d-3e7cbee5cdf1/model-vers/model-ver/a580855f-8d1b-40d5-a75b-50709fbd17d3/model-elements/model-element/06014449-69d3-4aef-a96b-0a5130ba9483/model-elements/model-element/a050dc96-2c35-45c7-ba23-9279215d501e\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"081ceb56-eb71-4566-a72d-3e7cbee5cdf1\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"a580855f-8d1b-40d5-a75b-50709fbd17d3\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"06014449-69d3-4aef-a96b-0a5130ba9483\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"a050dc96-2c35-45c7-ba23-9279215d501e\"" +
                "                    }" +
                "                  ]" +
                "                }" +
                "              ]" +
                "            }" +
                "          }" +
                "        ]" +
                "      }" +
                "    }, {" +
                "      \"model-invariant-id\": \"081ceb56-eb71-4566-a72d-3e7cbee5cdf1\"," +
                "      \"model-type\": \"resource\"," +
                "      \"resource-version\": \"1534788713816\"," +
                "      \"model-vers\": {" +
                "        \"model-ver\": [{" +
                "            \"model-version-id\": \"747d2a17-5771-4fd6-879d-c2e9e4c5cd4f\"," +
                "            \"model-name\": \"NCM_VLAN_ym161f\"," +
                "            \"model-version\": \"2.0\"," +
                "            \"model-description\": \"Network Collection Service VF for VLAN TAgging\"," +
                "            \"resource-version\": \"1534863623891\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"0dd28c63-cadf-48b2-afb0-a7bf7184ef5a\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534863623895\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/425b2158-e51d-4509-9945-dad4556474a3/model-vers/model-ver/2a160989-b202-47dd-874b-4a0f275998f7\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"425b2158-e51d-4509-9945-dad4556474a3\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"2a160989-b202-47dd-874b-4a0f275998f7\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"cloud-region\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }," +
                "            \"relationship-list\": {" +
                "              \"relationship\": [{" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/d4a447e5-9791-47b9-b365-1abb19b4b626/model-elements/model-element/0ef29f1f-836a-4fab-986c-5f1b96310a3d/model-elements/model-element/700f890b-05c9-471a-b859-956655d28f47\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"d4a447e5-9791-47b9-b365-1abb19b4b626\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"0ef29f1f-836a-4fab-986c-5f1b96310a3d\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"700f890b-05c9-471a-b859-956655d28f47\"" +
                "                    }" +
                "                  ]" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"a580855f-8d1b-40d5-a75b-50709fbd17d3\"," +
                "            \"model-name\": \"NCM_VLAN_ym161f\"," +
                "            \"model-version\": \"6.0\"," +
                "            \"model-description\": \"Network Collection Service VF for VLAN TAgging\"," +
                "            \"resource-version\": \"1543961989670\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"06014449-69d3-4aef-a96b-0a5130ba9483\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1543961989670\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/8bac3599-9a1c-4b7f-80e5-c1838f744c23/model-vers/model-ver/3f908abc-3a15-40d0-b674-2a639e52884d\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"8bac3599-9a1c-4b7f-80e5-c1838f744c23\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"3f908abc-3a15-40d0-b674-2a639e52884d\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"collection\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }," +
                "            \"relationship-list\": {" +
                "              \"relationship\": [{" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/0e97a118-b1b6-40d5-bbad-98cdd51b1c48/model-elements/model-element/0ea8ac21-64b8-4489-9d62-12e625d66995/model-elements/model-element/d614653c-5f19-4668-ad98-cfbe012308e1\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"0e97a118-b1b6-40d5-bbad-98cdd51b1c48\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"0ea8ac21-64b8-4489-9d62-12e625d66995\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"d614653c-5f19-4668-ad98-cfbe012308e1\"" +
                "                    }" +
                "                  ]" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"b84e2233-37bf-4c8d-b613-eb8a8820b725\"," +
                "            \"model-name\": \"NCM_VLAN_ym161f\"," +
                "            \"model-version\": \"4.0\"," +
                "            \"model-description\": \"Network Collection Service VF for VLAN TAgging\"," +
                "            \"resource-version\": \"1534883153714\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"f7c3f5bb-777a-4d9f-9401-a652f5006152\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534883153720\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/425b2158-e51d-4509-9945-dad4556474a3/model-vers/model-ver/2a160989-b202-47dd-874b-4a0f275998f7\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"425b2158-e51d-4509-9945-dad4556474a3\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"2a160989-b202-47dd-874b-4a0f275998f7\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"cloud-region\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }," +
                "            \"relationship-list\": {" +
                "              \"relationship\": [{" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/1ceab842-7ded-49f1-a129-dce2ecef8c71/model-elements/model-element/5ca853fc-2984-45c7-b2e7-8514a56785ba/model-elements/model-element/030553aa-8d82-4b03-a3dc-bc210daadd5e\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"1ceab842-7ded-49f1-a129-dce2ecef8c71\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"5ca853fc-2984-45c7-b2e7-8514a56785ba\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"030553aa-8d82-4b03-a3dc-bc210daadd5e\"" +
                "                    }" +
                "                  ]" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"5ededaad-905c-4356-b30d-471b0ae2a12a\"," +
                "            \"model-name\": \"NCM_VLAN_ym161f\"," +
                "            \"model-version\": \"3.0\"," +
                "            \"model-description\": \"Network Collection Service VF for VLAN TAgging\"," +
                "            \"resource-version\": \"1534872173817\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"31f558c6-d73a-43e4-aab0-c863ccd6b110\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534872173821\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/425b2158-e51d-4509-9945-dad4556474a3/model-vers/model-ver/2a160989-b202-47dd-874b-4a0f275998f7\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"425b2158-e51d-4509-9945-dad4556474a3\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"2a160989-b202-47dd-874b-4a0f275998f7\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"cloud-region\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }," +
                "            \"relationship-list\": {" +
                "              \"relationship\": [{" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/fd21f6b5-02f6-4ac0-9515-e1f01112da95/model-elements/model-element/0812b47d-7ef1-4a65-b6fb-9f3ff3bc3eee/model-elements/model-element/110a5ba4-997b-45f0-8e53-d64d6b342be1\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"fd21f6b5-02f6-4ac0-9515-e1f01112da95\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"0812b47d-7ef1-4a65-b6fb-9f3ff3bc3eee\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"110a5ba4-997b-45f0-8e53-d64d6b342be1\"" +
                "                    }" +
                "                  ]" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"67b91dcd-4fa5-4111-80c9-60d524740667\"," +
                "            \"model-name\": \"NCM_VLAN_ym161f\"," +
                "            \"model-version\": \"1.0\"," +
                "            \"model-description\": \"Network Collection Service VF for VLAN TAgging\"," +
                "            \"resource-version\": \"1534788713822\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"6fdf228e-89ce-4cf6-9bd7-399aa1b690b3\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534788713833\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/425b2158-e51d-4509-9945-dad4556474a3/model-vers/model-ver/2a160989-b202-47dd-874b-4a0f275998f7\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"425b2158-e51d-4509-9945-dad4556474a3\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"2a160989-b202-47dd-874b-4a0f275998f7\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"cloud-region\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }" +
                "          }, {" +
                "            \"model-version-id\": \"ce8c98bc-4691-44fb-8ff0-7a47487c11c4\"," +
                "            \"model-name\": \"NCM_VLAN_ym161f\"," +
                "            \"model-version\": \"5.0\"," +
                "            \"model-description\": \"Network Collection Service VF for VLAN TAgging\"," +
                "            \"resource-version\": \"1534885013739\"," +
                "            \"model-elements\": {" +
                "              \"model-element\": [{" +
                "                  \"model-element-uuid\": \"4bd10473-a9de-4399-abe7-c9b24e48e0ee\"," +
                "                  \"new-data-del-flag\": \"T\"," +
                "                  \"cardinality\": \"unbounded\"," +
                "                  \"resource-version\": \"1534885013745\"," +
                "                  \"relationship-list\": {" +
                "                    \"relationship\": [{" +
                "                        \"related-to\": \"model-ver\"," +
                "                        \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                        \"related-link\": \"/aai/v14/service-design-and-creation/models/model/425b2158-e51d-4509-9945-dad4556474a3/model-vers/model-ver/2a160989-b202-47dd-874b-4a0f275998f7\"," +
                "                        \"relationship-data\": [{" +
                "                            \"relationship-key\": \"model.model-invariant-id\"," +
                "                            \"relationship-value\": \"425b2158-e51d-4509-9945-dad4556474a3\"" +
                "                          }, {" +
                "                            \"relationship-key\": \"model-ver.model-version-id\"," +
                "                            \"relationship-value\": \"2a160989-b202-47dd-874b-4a0f275998f7\"" +
                "                          }" +
                "                        ]," +
                "                        \"related-to-property\": [{" +
                "                            \"property-key\": \"model-ver.model-name\"," +
                "                            \"property-value\": \"cloud-region\"" +
                "                          }" +
                "                        ]" +
                "                      }" +
                "                    ]" +
                "                  }" +
                "                }" +
                "              ]" +
                "            }," +
                "            \"relationship-list\": {" +
                "              \"relationship\": [{" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/12930bcc-5276-42bb-8ed6-1e43d7acae2c/model-elements/model-element/4d57798e-81b7-490e-bee8-48bd382a1349/model-elements/model-element/93eafb42-11b5-471d-8f8a-333408114a9a\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"12930bcc-5276-42bb-8ed6-1e43d7acae2c\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"4d57798e-81b7-490e-bee8-48bd382a1349\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"93eafb42-11b5-471d-8f8a-333408114a9a\"" +
                "                    }" +
                "                  ]" +
                "                }, {" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/6e0bec91-09f3-43aa-9cf3-e617cd0146be/model-elements/model-element/a0247d2e-3843-4753-be2f-4c252c99390e/model-elements/model-element/cb986adf-5ca8-48a5-ac9b-b222d6d2e280\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"6e0bec91-09f3-43aa-9cf3-e617cd0146be\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"a0247d2e-3843-4753-be2f-4c252c99390e\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"cb986adf-5ca8-48a5-ac9b-b222d6d2e280\"" +
                "                    }" +
                "                  ]" +
                "                }, {" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/0148e4c5-629b-4fef-9728-1e13fd630679/model-elements/model-element/6ae6fd91-2086-470d-8c36-9d668c41fd32/model-elements/model-element/a520808b-b8bc-4969-9eba-c85e2797f3dd\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"0148e4c5-629b-4fef-9728-1e13fd630679\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"6ae6fd91-2086-470d-8c36-9d668c41fd32\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"a520808b-b8bc-4969-9eba-c85e2797f3dd\"" +
                "                    }" +
                "                  ]" +
                "                }, {" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/ca26a7e6-064d-4e90-a5b9-32ffe819f826/model-vers/model-ver/e9a290ca-41f0-4117-a1b5-8b7cd5595ff7/model-elements/model-element/ff3fdeb9-24e9-406f-8761-1334c9ea29d1/model-elements/model-element/bc6ddc86-f948-4f47-a4e6-bededd8d5780\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"ca26a7e6-064d-4e90-a5b9-32ffe819f826\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"e9a290ca-41f0-4117-a1b5-8b7cd5595ff7\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"ff3fdeb9-24e9-406f-8761-1334c9ea29d1\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"bc6ddc86-f948-4f47-a4e6-bededd8d5780\"" +
                "                    }" +
                "                  ]" +
                "                }, {" +
                "                  \"related-to\": \"model-element\"," +
                "                  \"relationship-label\": \"org.onap.relationships.inventory.IsA\"," +
                "                  \"related-link\": \"/aai/v14/service-design-and-creation/models/model/f6342be5-d66b-4d03-a1aa-c82c3094c4ea/model-vers/model-ver/46093d8f-6dfa-4332-9c00-7e822c681b59/model-elements/model-element/d74a5dff-ef7f-4e32-9c13-d82fb2c617c9/model-elements/model-element/f7bd32b4-bbbf-4788-9137-9dfa299e6111\"," +
                "                  \"relationship-data\": [{" +
                "                      \"relationship-key\": \"model.model-invariant-id\"," +
                "                      \"relationship-value\": \"f6342be5-d66b-4d03-a1aa-c82c3094c4ea\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-ver.model-version-id\"," +
                "                      \"relationship-value\": \"46093d8f-6dfa-4332-9c00-7e822c681b59\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"d74a5dff-ef7f-4e32-9c13-d82fb2c617c9\"" +
                "                    }, {" +
                "                      \"relationship-key\": \"model-element.model-element-uuid\"," +
                "                      \"relationship-value\": \"f7bd32b4-bbbf-4788-9137-9dfa299e6111\"" +
                "                    }" +
                "                  ]" +
                "                }" +
                "              ]" +
                "            }" +
                "          }" +
                "        ]" +
                "      }" +
                "    }" +
                "  ]" +
                "}";
    }
}
