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
 * Annotations associated with the plain-text body of the message. Example plain-text message body:
 * ``` Hello @FooBot how are you!" ``` The corresponding annotations metadata: ``` "annotations":[{
 * "type":"USER_MENTION", "startIndex":6, "length":7, "userMention": { "user": {
 * "name":"users/107946847022116401880", "displayName":"FooBot",
 * "avatarUrl":"https://goo.gl/aeDtrS", "type":"BOT" }, "type":"MENTION" } }] ```
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Annotation extends com.google.api.client.json.GenericJson {

  /**
   * Length of the substring in the plain-text message body this annotation corresponds to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer length;

  /**
   * The metadata for a slash command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlashCommandMetadata slashCommand;

  /**
   * Start index (0-based, inclusive) in the plain-text message body this annotation corresponds to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The type of this annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The metadata of user mention.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserMentionMetadata userMention;

  /**
   * Length of the substring in the plain-text message body this annotation corresponds to.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLength() {
    return length;
  }

  /**
   * Length of the substring in the plain-text message body this annotation corresponds to.
   * @param length length or {@code null} for none
   */
  public Annotation setLength(java.lang.Integer length) {
    this.length = length;
    return this;
  }

  /**
   * The metadata for a slash command.
   * @return value or {@code null} for none
   */
  public SlashCommandMetadata getSlashCommand() {
    return slashCommand;
  }

  /**
   * The metadata for a slash command.
   * @param slashCommand slashCommand or {@code null} for none
   */
  public Annotation setSlashCommand(SlashCommandMetadata slashCommand) {
    this.slashCommand = slashCommand;
    return this;
  }

  /**
   * Start index (0-based, inclusive) in the plain-text message body this annotation corresponds to.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * Start index (0-based, inclusive) in the plain-text message body this annotation corresponds to.
   * @param startIndex startIndex or {@code null} for none
   */
  public Annotation setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The type of this annotation.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of this annotation.
   * @param type type or {@code null} for none
   */
  public Annotation setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The metadata of user mention.
   * @return value or {@code null} for none
   */
  public UserMentionMetadata getUserMention() {
    return userMention;
  }

  /**
   * The metadata of user mention.
   * @param userMention userMention or {@code null} for none
   */
  public Annotation setUserMention(UserMentionMetadata userMention) {
    this.userMention = userMention;
    return this;
  }

  @Override
  public Annotation set(String fieldName, Object value) {
    return (Annotation) super.set(fieldName, value);
  }

  @Override
  public Annotation clone() {
    return (Annotation) super.clone();
  }

}
