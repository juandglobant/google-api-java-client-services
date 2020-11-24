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

package com.google.api.services.reseller.model;

/**
 * JSON template for a subscription list.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Enterprise Apps Reseller API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subscriptions extends com.google.api.client.json.GenericJson {

  /**
   * Identifies the resource as a collection of subscriptions. Value: reseller#subscriptions
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The subscriptions in this page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Subscription> subscriptions;

  static {
    // hack to force ProGuard to consider Subscription used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Subscription.class);
  }

  /**
   * Identifies the resource as a collection of subscriptions. Value: reseller#subscriptions
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a collection of subscriptions. Value: reseller#subscriptions
   * @param kind kind or {@code null} for none
   */
  public Subscriptions setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The continuation token, used to page through large result sets. Provide this value in a
   * subsequent request to return the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public Subscriptions setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The subscriptions in this page of results.
   * @return value or {@code null} for none
   */
  public java.util.List<Subscription> getSubscriptions() {
    return subscriptions;
  }

  /**
   * The subscriptions in this page of results.
   * @param subscriptions subscriptions or {@code null} for none
   */
  public Subscriptions setSubscriptions(java.util.List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  @Override
  public Subscriptions set(String fieldName, Object value) {
    return (Subscriptions) super.set(fieldName, value);
  }

  @Override
  public Subscriptions clone() {
    return (Subscriptions) super.clone();
  }

}
