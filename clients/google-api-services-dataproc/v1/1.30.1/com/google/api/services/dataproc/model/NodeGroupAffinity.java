/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dataproc.model;

/**
 * Node Group Affinity for clusters using sole-tenant node groups.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeGroupAffinity extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of a single node group
   * (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) a cluster will be created
   * on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeGroupUri;

  /**
   * Required. The name of a single node group
   * (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) a cluster will be created
   * on.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeGroupUri() {
    return nodeGroupUri;
  }

  /**
   * Required. The name of a single node group
   * (https://cloud.google.com/compute/docs/reference/rest/v1/nodeGroups) a cluster will be created
   * on.
   * @param nodeGroupUri nodeGroupUri or {@code null} for none
   */
  public NodeGroupAffinity setNodeGroupUri(java.lang.String nodeGroupUri) {
    this.nodeGroupUri = nodeGroupUri;
    return this;
  }

  @Override
  public NodeGroupAffinity set(String fieldName, Object value) {
    return (NodeGroupAffinity) super.set(fieldName, value);
  }

  @Override
  public NodeGroupAffinity clone() {
    return (NodeGroupAffinity) super.clone();
  }

}
