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
 * A parameter in a data source's query. The parameter allows user to pass in values from the
 * spreadsheet into a query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceParameter extends com.google.api.client.json.GenericJson {

  /**
   * Named parameter. Must be a legitimate identifier for the DataSource that supports it. For
   * example, BigQuery identifier
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * ID of a NamedRange. Its size must be 1x1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namedRangeId;

  /**
   * A range that contains the value of the parameter. Its size must be 1x1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridRange range;

  /**
   * Named parameter. Must be a legitimate identifier for the DataSource that supports it. For
   * example, BigQuery identifier
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Named parameter. Must be a legitimate identifier for the DataSource that supports it. For
   * example, BigQuery identifier
   * @param name name or {@code null} for none
   */
  public DataSourceParameter setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * ID of a NamedRange. Its size must be 1x1.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamedRangeId() {
    return namedRangeId;
  }

  /**
   * ID of a NamedRange. Its size must be 1x1.
   * @param namedRangeId namedRangeId or {@code null} for none
   */
  public DataSourceParameter setNamedRangeId(java.lang.String namedRangeId) {
    this.namedRangeId = namedRangeId;
    return this;
  }

  /**
   * A range that contains the value of the parameter. Its size must be 1x1.
   * @return value or {@code null} for none
   */
  public GridRange getRange() {
    return range;
  }

  /**
   * A range that contains the value of the parameter. Its size must be 1x1.
   * @param range range or {@code null} for none
   */
  public DataSourceParameter setRange(GridRange range) {
    this.range = range;
    return this;
  }

  @Override
  public DataSourceParameter set(String fieldName, Object value) {
    return (DataSourceParameter) super.set(fieldName, value);
  }

  @Override
  public DataSourceParameter clone() {
    return (DataSourceParameter) super.clone();
  }

}
