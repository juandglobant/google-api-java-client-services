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
 * The BigQuery table for export.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BigQueryDestination extends com.google.api.client.json.GenericJson {

  /**
   * If the destination table already exists and this flag is `TRUE`, the table will be overwritten
   * by the contents of the input store. If the flag is not set and the destination table already
   * exists, the export call returns an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean force;

  /**
   * BigQuery URI to a table, up to 2000 characters long, must be of the form
   * bq://projectId.bqDatasetId.tableId.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableUri;

  /**
   * If the destination table already exists and this flag is `TRUE`, the table will be overwritten
   * by the contents of the input store. If the flag is not set and the destination table already
   * exists, the export call returns an error.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForce() {
    return force;
  }

  /**
   * If the destination table already exists and this flag is `TRUE`, the table will be overwritten
   * by the contents of the input store. If the flag is not set and the destination table already
   * exists, the export call returns an error.
   * @param force force or {@code null} for none
   */
  public BigQueryDestination setForce(java.lang.Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * BigQuery URI to a table, up to 2000 characters long, must be of the form
   * bq://projectId.bqDatasetId.tableId.
   * @return value or {@code null} for none
   */
  public java.lang.String getTableUri() {
    return tableUri;
  }

  /**
   * BigQuery URI to a table, up to 2000 characters long, must be of the form
   * bq://projectId.bqDatasetId.tableId.
   * @param tableUri tableUri or {@code null} for none
   */
  public BigQueryDestination setTableUri(java.lang.String tableUri) {
    this.tableUri = tableUri;
    return this;
  }

  @Override
  public BigQueryDestination set(String fieldName, Object value) {
    return (BigQueryDestination) super.set(fieldName, value);
  }

  @Override
  public BigQueryDestination clone() {
    return (BigQueryDestination) super.clone();
  }

}
