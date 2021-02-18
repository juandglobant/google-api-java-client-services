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

package com.google.api.services.cloudresourcemanager.v3.model;

/**
 * A status object which is used as the `metadata` field for the Operation returned by
 * CreateProject. It provides insight for when significant phases of Project creation have
 * completed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateProjectMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Creation time of the project creation workflow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * True if the project can be retrieved using GetProject. No other operations on the project are
   * guaranteed to work until the project creation is complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean gettable;

  /**
   * True if the project creation process is complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ready;

  /**
   * Creation time of the project creation workflow.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Creation time of the project creation workflow.
   * @param createTime createTime or {@code null} for none
   */
  public CreateProjectMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * True if the project can be retrieved using GetProject. No other operations on the project are
   * guaranteed to work until the project creation is complete.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGettable() {
    return gettable;
  }

  /**
   * True if the project can be retrieved using GetProject. No other operations on the project are
   * guaranteed to work until the project creation is complete.
   * @param gettable gettable or {@code null} for none
   */
  public CreateProjectMetadata setGettable(java.lang.Boolean gettable) {
    this.gettable = gettable;
    return this;
  }

  /**
   * True if the project creation process is complete.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReady() {
    return ready;
  }

  /**
   * True if the project creation process is complete.
   * @param ready ready or {@code null} for none
   */
  public CreateProjectMetadata setReady(java.lang.Boolean ready) {
    this.ready = ready;
    return this;
  }

  @Override
  public CreateProjectMetadata set(String fieldName, Object value) {
    return (CreateProjectMetadata) super.set(fieldName, value);
  }

  @Override
  public CreateProjectMetadata clone() {
    return (CreateProjectMetadata) super.clone();
  }

}
