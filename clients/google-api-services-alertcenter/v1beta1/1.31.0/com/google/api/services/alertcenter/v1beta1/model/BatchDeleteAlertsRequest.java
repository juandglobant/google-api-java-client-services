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

package com.google.api.services.alertcenter.v1beta1.model;

/**
 * A request to perform batch delete on alerts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Alert Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchDeleteAlertsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. list of alert IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> alertId;

  /**
   * Optional. The unique identifier of the Google Workspace organization account of the customer
   * the alerts are associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * Required. list of alert IDs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAlertId() {
    return alertId;
  }

  /**
   * Required. list of alert IDs.
   * @param alertId alertId or {@code null} for none
   */
  public BatchDeleteAlertsRequest setAlertId(java.util.List<java.lang.String> alertId) {
    this.alertId = alertId;
    return this;
  }

  /**
   * Optional. The unique identifier of the Google Workspace organization account of the customer
   * the alerts are associated with.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * Optional. The unique identifier of the Google Workspace organization account of the customer
   * the alerts are associated with.
   * @param customerId customerId or {@code null} for none
   */
  public BatchDeleteAlertsRequest setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  @Override
  public BatchDeleteAlertsRequest set(String fieldName, Object value) {
    return (BatchDeleteAlertsRequest) super.set(fieldName, value);
  }

  @Override
  public BatchDeleteAlertsRequest clone() {
    return (BatchDeleteAlertsRequest) super.clone();
  }

}
