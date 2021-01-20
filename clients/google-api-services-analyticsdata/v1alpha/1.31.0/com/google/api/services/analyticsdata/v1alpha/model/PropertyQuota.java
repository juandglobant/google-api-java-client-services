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

package com.google.api.services.analyticsdata.v1alpha.model;

/**
 * Current state of all quotas for this Analytics Property. If any quota for a property is
 * exhausted, all requests to that property will return Resource Exhausted errors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PropertyQuota extends com.google.api.client.json.GenericJson {

  /**
   * Standard Analytics Properties can send up to 10 concurrent requests; Analytics 360 Properties
   * can use up to 50 concurrent requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QuotaStatus concurrentRequests;

  /**
   * Standard Analytics Properties and cloud project pairs can have up to 10 server errors per hour;
   * Analytics 360 Properties and cloud project pairs can have up to 50 server errors per hour.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QuotaStatus serverErrorsPerProjectPerHour;

  /**
   * Standard Analytics Properties can use up to 25,000 tokens per day; Analytics 360 Properties can
   * use 250,000 tokens per day. Most requests consume fewer than 10 tokens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QuotaStatus tokensPerDay;

  /**
   * Standard Analytics Properties can use up to 5,000 tokens per hour; Analytics 360 Properties can
   * use 50,000 tokens per hour. An API request consumes a single number of tokens, and that number
   * is deducted from both the hourly and daily quotas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QuotaStatus tokensPerHour;

  /**
   * Standard Analytics Properties can send up to 10 concurrent requests; Analytics 360 Properties
   * can use up to 50 concurrent requests.
   * @return value or {@code null} for none
   */
  public QuotaStatus getConcurrentRequests() {
    return concurrentRequests;
  }

  /**
   * Standard Analytics Properties can send up to 10 concurrent requests; Analytics 360 Properties
   * can use up to 50 concurrent requests.
   * @param concurrentRequests concurrentRequests or {@code null} for none
   */
  public PropertyQuota setConcurrentRequests(QuotaStatus concurrentRequests) {
    this.concurrentRequests = concurrentRequests;
    return this;
  }

  /**
   * Standard Analytics Properties and cloud project pairs can have up to 10 server errors per hour;
   * Analytics 360 Properties and cloud project pairs can have up to 50 server errors per hour.
   * @return value or {@code null} for none
   */
  public QuotaStatus getServerErrorsPerProjectPerHour() {
    return serverErrorsPerProjectPerHour;
  }

  /**
   * Standard Analytics Properties and cloud project pairs can have up to 10 server errors per hour;
   * Analytics 360 Properties and cloud project pairs can have up to 50 server errors per hour.
   * @param serverErrorsPerProjectPerHour serverErrorsPerProjectPerHour or {@code null} for none
   */
  public PropertyQuota setServerErrorsPerProjectPerHour(QuotaStatus serverErrorsPerProjectPerHour) {
    this.serverErrorsPerProjectPerHour = serverErrorsPerProjectPerHour;
    return this;
  }

  /**
   * Standard Analytics Properties can use up to 25,000 tokens per day; Analytics 360 Properties can
   * use 250,000 tokens per day. Most requests consume fewer than 10 tokens.
   * @return value or {@code null} for none
   */
  public QuotaStatus getTokensPerDay() {
    return tokensPerDay;
  }

  /**
   * Standard Analytics Properties can use up to 25,000 tokens per day; Analytics 360 Properties can
   * use 250,000 tokens per day. Most requests consume fewer than 10 tokens.
   * @param tokensPerDay tokensPerDay or {@code null} for none
   */
  public PropertyQuota setTokensPerDay(QuotaStatus tokensPerDay) {
    this.tokensPerDay = tokensPerDay;
    return this;
  }

  /**
   * Standard Analytics Properties can use up to 5,000 tokens per hour; Analytics 360 Properties can
   * use 50,000 tokens per hour. An API request consumes a single number of tokens, and that number
   * is deducted from both the hourly and daily quotas.
   * @return value or {@code null} for none
   */
  public QuotaStatus getTokensPerHour() {
    return tokensPerHour;
  }

  /**
   * Standard Analytics Properties can use up to 5,000 tokens per hour; Analytics 360 Properties can
   * use 50,000 tokens per hour. An API request consumes a single number of tokens, and that number
   * is deducted from both the hourly and daily quotas.
   * @param tokensPerHour tokensPerHour or {@code null} for none
   */
  public PropertyQuota setTokensPerHour(QuotaStatus tokensPerHour) {
    this.tokensPerHour = tokensPerHour;
    return this;
  }

  @Override
  public PropertyQuota set(String fieldName, Object value) {
    return (PropertyQuota) super.set(fieldName, value);
  }

  @Override
  public PropertyQuota clone() {
    return (PropertyQuota) super.clone();
  }

}
