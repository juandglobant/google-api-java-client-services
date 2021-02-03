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

package com.google.api.services.chat.v1.model;

/**
 * Parameters that a bot can use to configure how it's response is posted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ActionResponse extends com.google.api.client.json.GenericJson {

  /**
   * The type of bot response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * URL for users to auth or config. (Only for REQUEST_CONFIG response types.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The type of bot response.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of bot response.
   * @param type type or {@code null} for none
   */
  public ActionResponse setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * URL for users to auth or config. (Only for REQUEST_CONFIG response types.)
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL for users to auth or config. (Only for REQUEST_CONFIG response types.)
   * @param url url or {@code null} for none
   */
  public ActionResponse setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ActionResponse set(String fieldName, Object value) {
    return (ActionResponse) super.set(fieldName, value);
  }

  @Override
  public ActionResponse clone() {
    return (ActionResponse) super.clone();
  }

}
