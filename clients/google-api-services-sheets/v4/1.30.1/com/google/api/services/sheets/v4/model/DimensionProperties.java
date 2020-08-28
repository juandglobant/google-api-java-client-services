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

package com.google.api.services.sheets.v4.model;

/**
 * Properties about a dimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DimensionProperties extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If set, this is a column in a data source sheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataSourceColumnReference dataSourceColumnReference;

  /**
   * The developer metadata associated with a single row or column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeveloperMetadata> developerMetadata;

  static {
    // hack to force ProGuard to consider DeveloperMetadata used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DeveloperMetadata.class);
  }

  /**
   * True if this dimension is being filtered. This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hiddenByFilter;

  /**
   * True if this dimension is explicitly hidden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hiddenByUser;

  /**
   * The height (if a row) or width (if a column) of the dimension in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pixelSize;

  /**
   * Output only. If set, this is a column in a data source sheet.
   * @return value or {@code null} for none
   */
  public DataSourceColumnReference getDataSourceColumnReference() {
    return dataSourceColumnReference;
  }

  /**
   * Output only. If set, this is a column in a data source sheet.
   * @param dataSourceColumnReference dataSourceColumnReference or {@code null} for none
   */
  public DimensionProperties setDataSourceColumnReference(DataSourceColumnReference dataSourceColumnReference) {
    this.dataSourceColumnReference = dataSourceColumnReference;
    return this;
  }

  /**
   * The developer metadata associated with a single row or column.
   * @return value or {@code null} for none
   */
  public java.util.List<DeveloperMetadata> getDeveloperMetadata() {
    return developerMetadata;
  }

  /**
   * The developer metadata associated with a single row or column.
   * @param developerMetadata developerMetadata or {@code null} for none
   */
  public DimensionProperties setDeveloperMetadata(java.util.List<DeveloperMetadata> developerMetadata) {
    this.developerMetadata = developerMetadata;
    return this;
  }

  /**
   * True if this dimension is being filtered. This field is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHiddenByFilter() {
    return hiddenByFilter;
  }

  /**
   * True if this dimension is being filtered. This field is read-only.
   * @param hiddenByFilter hiddenByFilter or {@code null} for none
   */
  public DimensionProperties setHiddenByFilter(java.lang.Boolean hiddenByFilter) {
    this.hiddenByFilter = hiddenByFilter;
    return this;
  }

  /**
   * True if this dimension is explicitly hidden.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHiddenByUser() {
    return hiddenByUser;
  }

  /**
   * True if this dimension is explicitly hidden.
   * @param hiddenByUser hiddenByUser or {@code null} for none
   */
  public DimensionProperties setHiddenByUser(java.lang.Boolean hiddenByUser) {
    this.hiddenByUser = hiddenByUser;
    return this;
  }

  /**
   * The height (if a row) or width (if a column) of the dimension in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPixelSize() {
    return pixelSize;
  }

  /**
   * The height (if a row) or width (if a column) of the dimension in pixels.
   * @param pixelSize pixelSize or {@code null} for none
   */
  public DimensionProperties setPixelSize(java.lang.Integer pixelSize) {
    this.pixelSize = pixelSize;
    return this;
  }

  @Override
  public DimensionProperties set(String fieldName, Object value) {
    return (DimensionProperties) super.set(fieldName, value);
  }

  @Override
  public DimensionProperties clone() {
    return (DimensionProperties) super.clone();
  }

}
