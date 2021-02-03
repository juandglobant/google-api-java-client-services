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
 * Annotation metadata for user mentions (@).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserMentionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The type of user mention.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The user mentioned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User user;

  /**
   * The type of user mention.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of user mention.
   * @param type type or {@code null} for none
   */
  public UserMentionMetadata setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The user mentioned.
   * @return value or {@code null} for none
   */
  public User getUser() {
    return user;
  }

  /**
   * The user mentioned.
   * @param user user or {@code null} for none
   */
  public UserMentionMetadata setUser(User user) {
    this.user = user;
    return this;
  }

  @Override
  public UserMentionMetadata set(String fieldName, Object value) {
    return (UserMentionMetadata) super.set(fieldName, value);
  }

  @Override
  public UserMentionMetadata clone() {
    return (UserMentionMetadata) super.clone();
  }

}
