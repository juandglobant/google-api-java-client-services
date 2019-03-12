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

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * The Cloud Storage location for export.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GcsDestination extends com.google.api.client.json.GenericJson {

  /**
   * The Cloud Storage destination to export to. URI for a Cloud Storage directory where result
   * files should be written (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If there
   * is no trailing slash, the service will append one when composing the object path. The user is
   * responsible for creating the Cloud Storage bucket referenced in `uri_prefix`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uriPrefix;

  /**
   * The Cloud Storage destination to export to. URI for a Cloud Storage directory where result
   * files should be written (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If there
   * is no trailing slash, the service will append one when composing the object path. The user is
   * responsible for creating the Cloud Storage bucket referenced in `uri_prefix`.
   * @return value or {@code null} for none
   */
  public java.lang.String getUriPrefix() {
    return uriPrefix;
  }

  /**
   * The Cloud Storage destination to export to. URI for a Cloud Storage directory where result
   * files should be written (in the format `gs://{bucket-id}/{path/to/destination/dir}`). If there
   * is no trailing slash, the service will append one when composing the object path. The user is
   * responsible for creating the Cloud Storage bucket referenced in `uri_prefix`.
   * @param uriPrefix uriPrefix or {@code null} for none
   */
  public GcsDestination setUriPrefix(java.lang.String uriPrefix) {
    this.uriPrefix = uriPrefix;
    return this;
  }

  @Override
  public GcsDestination set(String fieldName, Object value) {
    return (GcsDestination) super.set(fieldName, value);
  }

  @Override
  public GcsDestination clone() {
    return (GcsDestination) super.clone();
  }

}
