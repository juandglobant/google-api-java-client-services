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
 * A range along a single dimension on a DataSource sheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceSheetDimensionRange extends com.google.api.client.json.GenericJson {

  /**
   * The columns on the data source sheet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataSourceColumnReference> columnReferences;

  static {
    // hack to force ProGuard to consider DataSourceColumnReference used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataSourceColumnReference.class);
  }

  /**
   * The ID of the data source sheet the range is on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sheetId;

  /**
   * The columns on the data source sheet.
   * @return value or {@code null} for none
   */
  public java.util.List<DataSourceColumnReference> getColumnReferences() {
    return columnReferences;
  }

  /**
   * The columns on the data source sheet.
   * @param columnReferences columnReferences or {@code null} for none
   */
  public DataSourceSheetDimensionRange setColumnReferences(java.util.List<DataSourceColumnReference> columnReferences) {
    this.columnReferences = columnReferences;
    return this;
  }

  /**
   * The ID of the data source sheet the range is on.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSheetId() {
    return sheetId;
  }

  /**
   * The ID of the data source sheet the range is on.
   * @param sheetId sheetId or {@code null} for none
   */
  public DataSourceSheetDimensionRange setSheetId(java.lang.Integer sheetId) {
    this.sheetId = sheetId;
    return this;
  }

  @Override
  public DataSourceSheetDimensionRange set(String fieldName, Object value) {
    return (DataSourceSheetDimensionRange) super.set(fieldName, value);
  }

  @Override
  public DataSourceSheetDimensionRange clone() {
    return (DataSourceSheetDimensionRange) super.clone();
  }

}
