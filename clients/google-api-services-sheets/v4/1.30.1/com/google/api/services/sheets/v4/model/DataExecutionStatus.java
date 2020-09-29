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
 * The data execution status. A data execution is created to sync a data source object with the
 * latest data from a DataSource. It is usually scheduled to run at background, you can check its
 * state to tell if an execution completes There are several scenarios where a data execution is
 * triggered to run: * Adding a data source creates an associated data source sheet as well as a
 * data execution to sync the data from the data source to the sheet. * Updating a data source
 * creates a data execution to refresh the associated data source sheet similarly. * You can send
 * refresh request to explicitly refresh one or multiple data source objects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataExecutionStatus extends com.google.api.client.json.GenericJson {

  /**
   * The error code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * The error message, which may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * Gets the time the data last successfully refreshed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastRefreshTime;

  /**
   * The state of the data execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The error code.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * The error code.
   * @param errorCode errorCode or {@code null} for none
   */
  public DataExecutionStatus setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The error message, which may be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * The error message, which may be empty.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public DataExecutionStatus setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Gets the time the data last successfully refreshed.
   * @return value or {@code null} for none
   */
  public String getLastRefreshTime() {
    return lastRefreshTime;
  }

  /**
   * Gets the time the data last successfully refreshed.
   * @param lastRefreshTime lastRefreshTime or {@code null} for none
   */
  public DataExecutionStatus setLastRefreshTime(String lastRefreshTime) {
    this.lastRefreshTime = lastRefreshTime;
    return this;
  }

  /**
   * The state of the data execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the data execution.
   * @param state state or {@code null} for none
   */
  public DataExecutionStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public DataExecutionStatus set(String fieldName, Object value) {
    return (DataExecutionStatus) super.set(fieldName, value);
  }

  @Override
  public DataExecutionStatus clone() {
    return (DataExecutionStatus) super.clone();
  }

}
