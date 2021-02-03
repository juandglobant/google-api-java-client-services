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
 * An image that is specified by a URL and can have an onclick action.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Image extends com.google.api.client.json.GenericJson {

  /**
   * The aspect ratio of this image (width/height). This field allows clients to reserve the right
   * height for the image while waiting for it to load. It's not meant to override the native aspect
   * ratio of the image. If unset, the server fills it by prefetching the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double aspectRatio;

  /**
   * The URL of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * The onclick action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnClick onClick;

  /**
   * The aspect ratio of this image (width/height). This field allows clients to reserve the right
   * height for the image while waiting for it to load. It's not meant to override the native aspect
   * ratio of the image. If unset, the server fills it by prefetching the image.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAspectRatio() {
    return aspectRatio;
  }

  /**
   * The aspect ratio of this image (width/height). This field allows clients to reserve the right
   * height for the image while waiting for it to load. It's not meant to override the native aspect
   * ratio of the image. If unset, the server fills it by prefetching the image.
   * @param aspectRatio aspectRatio or {@code null} for none
   */
  public Image setAspectRatio(java.lang.Double aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

  /**
   * The URL of the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * The URL of the image.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public Image setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * The onclick action.
   * @return value or {@code null} for none
   */
  public OnClick getOnClick() {
    return onClick;
  }

  /**
   * The onclick action.
   * @param onClick onClick or {@code null} for none
   */
  public Image setOnClick(OnClick onClick) {
    this.onClick = onClick;
    return this;
  }

  @Override
  public Image set(String fieldName, Object value) {
    return (Image) super.set(fieldName, value);
  }

  @Override
  public Image clone() {
    return (Image) super.clone();
  }

}
