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
 * Schedule refreshes in a time interval everyday.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceRefreshDailySchedule extends com.google.api.client.json.GenericJson {

  /**
   * The start time of a time interval in which a data source refresh is scheduled. Only `hours`
   * part is used. The time interval size defaults to that in the Sheets editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay startTime;

  /**
   * The start time of a time interval in which a data source refresh is scheduled. Only `hours`
   * part is used. The time interval size defaults to that in the Sheets editor.
   * @return value or {@code null} for none
   */
  public TimeOfDay getStartTime() {
    return startTime;
  }

  /**
   * The start time of a time interval in which a data source refresh is scheduled. Only `hours`
   * part is used. The time interval size defaults to that in the Sheets editor.
   * @param startTime startTime or {@code null} for none
   */
  public DataSourceRefreshDailySchedule setStartTime(TimeOfDay startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public DataSourceRefreshDailySchedule set(String fieldName, Object value) {
    return (DataSourceRefreshDailySchedule) super.set(fieldName, value);
  }

  @Override
  public DataSourceRefreshDailySchedule clone() {
    return (DataSourceRefreshDailySchedule) super.clone();
  }

}
