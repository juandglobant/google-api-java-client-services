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

package com.google.api.services.cloudchannel.v1.model;

/**
 * Request message for CloudChannelService.ListTransferableSkus
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1ListTransferableSkusRequest extends com.google.api.client.json.GenericJson {

  /**
   * This token is generated by the Super Admin of the resold customer to authorize a reseller to
   * access their Cloud Identity and purchase entitlements on their behalf. This token can be
   * omitted once the authorization is generated. See https://support.google.com/a/answer/7643790
   * for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authToken;

  /**
   * Customer's Cloud Identity ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudIdentityId;

  /**
   * A reseller is required to create a customer and use the resource name of the created customer
   * here. The customer_name takes the format: accounts/{account_id}/customers/{customer_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerName;

  /**
   * The BCP-47 language code, such as "en-US". If specified, the response will be localized to the
   * corresponding language code. Default is "en-US". Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Requested page size. Server might return fewer results than requested. If unspecified, at most
   * 100 SKUs will be returned. The maximum value is 1000; values above 1000 will be coerced to
   * 1000. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A token identifying a page of results, if other than the first one. Typically obtained via
   * ListTransferableSkusResponse.next_page_token of the previous
   * CloudChannelService.ListTransferableSkus call. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * This token is generated by the Super Admin of the resold customer to authorize a reseller to
   * access their Cloud Identity and purchase entitlements on their behalf. This token can be
   * omitted once the authorization is generated. See https://support.google.com/a/answer/7643790
   * for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthToken() {
    return authToken;
  }

  /**
   * This token is generated by the Super Admin of the resold customer to authorize a reseller to
   * access their Cloud Identity and purchase entitlements on their behalf. This token can be
   * omitted once the authorization is generated. See https://support.google.com/a/answer/7643790
   * for more details.
   * @param authToken authToken or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusRequest setAuthToken(java.lang.String authToken) {
    this.authToken = authToken;
    return this;
  }

  /**
   * Customer's Cloud Identity ID
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudIdentityId() {
    return cloudIdentityId;
  }

  /**
   * Customer's Cloud Identity ID
   * @param cloudIdentityId cloudIdentityId or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusRequest setCloudIdentityId(java.lang.String cloudIdentityId) {
    this.cloudIdentityId = cloudIdentityId;
    return this;
  }

  /**
   * A reseller is required to create a customer and use the resource name of the created customer
   * here. The customer_name takes the format: accounts/{account_id}/customers/{customer_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerName() {
    return customerName;
  }

  /**
   * A reseller is required to create a customer and use the resource name of the created customer
   * here. The customer_name takes the format: accounts/{account_id}/customers/{customer_id}
   * @param customerName customerName or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusRequest setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * The BCP-47 language code, such as "en-US". If specified, the response will be localized to the
   * corresponding language code. Default is "en-US". Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * The BCP-47 language code, such as "en-US". If specified, the response will be localized to the
   * corresponding language code. Default is "en-US". Optional.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusRequest setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Requested page size. Server might return fewer results than requested. If unspecified, at most
   * 100 SKUs will be returned. The maximum value is 1000; values above 1000 will be coerced to
   * 1000. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Requested page size. Server might return fewer results than requested. If unspecified, at most
   * 100 SKUs will be returned. The maximum value is 1000; values above 1000 will be coerced to
   * 1000. Optional.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A token identifying a page of results, if other than the first one. Typically obtained via
   * ListTransferableSkusResponse.next_page_token of the previous
   * CloudChannelService.ListTransferableSkus call. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A token identifying a page of results, if other than the first one. Typically obtained via
   * ListTransferableSkusResponse.next_page_token of the previous
   * CloudChannelService.ListTransferableSkus call. Optional.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleCloudChannelV1ListTransferableSkusRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  @Override
  public GoogleCloudChannelV1ListTransferableSkusRequest set(String fieldName, Object value) {
    return (GoogleCloudChannelV1ListTransferableSkusRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1ListTransferableSkusRequest clone() {
    return (GoogleCloudChannelV1ListTransferableSkusRequest) super.clone();
  }

}
