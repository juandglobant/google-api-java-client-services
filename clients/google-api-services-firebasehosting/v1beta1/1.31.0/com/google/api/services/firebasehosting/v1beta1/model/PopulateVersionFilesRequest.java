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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * The request to populate a Version's Files.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PopulateVersionFilesRequest extends com.google.api.client.json.GenericJson {

  /**
   * A set of file paths to the hashes corresponding to assets that should be added to the version.
   * Note that a file path to an empty hash will remove the path from the version. Calculate a hash
   * by Gzipping the file then taking the SHA256 hash of the newly compressed file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> files;

  /**
   * A set of file paths to the hashes corresponding to assets that should be added to the version.
   * Note that a file path to an empty hash will remove the path from the version. Calculate a hash
   * by Gzipping the file then taking the SHA256 hash of the newly compressed file.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getFiles() {
    return files;
  }

  /**
   * A set of file paths to the hashes corresponding to assets that should be added to the version.
   * Note that a file path to an empty hash will remove the path from the version. Calculate a hash
   * by Gzipping the file then taking the SHA256 hash of the newly compressed file.
   * @param files files or {@code null} for none
   */
  public PopulateVersionFilesRequest setFiles(java.util.Map<String, java.lang.String> files) {
    this.files = files;
    return this;
  }

  @Override
  public PopulateVersionFilesRequest set(String fieldName, Object value) {
    return (PopulateVersionFilesRequest) super.set(fieldName, value);
  }

  @Override
  public PopulateVersionFilesRequest clone() {
    return (PopulateVersionFilesRequest) super.clone();
  }

}
