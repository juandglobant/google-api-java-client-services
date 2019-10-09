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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * Provides information about the scan status of a discovered resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Discovered extends com.google.api.client.json.GenericJson {

  /**
   * The status of discovery for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String analysisStatus;

  /**
   * When an error is encountered this will contain a LocalizedMessage under details to show to the
   * user. The LocalizedMessage output only and populated by the API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status analysisStatusError;

  /**
   * Whether the resource is continuously analyzed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String continuousAnalysis;

  /**
   * The CPE of the resource being scanned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpe;

  /**
   * Output only. An operation that indicates the status of the current scan. This field is
   * deprecated, do not use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Operation operation;

  /**
   * The status of discovery for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnalysisStatus() {
    return analysisStatus;
  }

  /**
   * The status of discovery for the resource.
   * @param analysisStatus analysisStatus or {@code null} for none
   */
  public Discovered setAnalysisStatus(java.lang.String analysisStatus) {
    this.analysisStatus = analysisStatus;
    return this;
  }

  /**
   * When an error is encountered this will contain a LocalizedMessage under details to show to the
   * user. The LocalizedMessage output only and populated by the API.
   * @return value or {@code null} for none
   */
  public Status getAnalysisStatusError() {
    return analysisStatusError;
  }

  /**
   * When an error is encountered this will contain a LocalizedMessage under details to show to the
   * user. The LocalizedMessage output only and populated by the API.
   * @param analysisStatusError analysisStatusError or {@code null} for none
   */
  public Discovered setAnalysisStatusError(Status analysisStatusError) {
    this.analysisStatusError = analysisStatusError;
    return this;
  }

  /**
   * Whether the resource is continuously analyzed.
   * @return value or {@code null} for none
   */
  public java.lang.String getContinuousAnalysis() {
    return continuousAnalysis;
  }

  /**
   * Whether the resource is continuously analyzed.
   * @param continuousAnalysis continuousAnalysis or {@code null} for none
   */
  public Discovered setContinuousAnalysis(java.lang.String continuousAnalysis) {
    this.continuousAnalysis = continuousAnalysis;
    return this;
  }

  /**
   * The CPE of the resource being scanned.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpe() {
    return cpe;
  }

  /**
   * The CPE of the resource being scanned.
   * @param cpe cpe or {@code null} for none
   */
  public Discovered setCpe(java.lang.String cpe) {
    this.cpe = cpe;
    return this;
  }

  /**
   * Output only. An operation that indicates the status of the current scan. This field is
   * deprecated, do not use.
   * @return value or {@code null} for none
   */
  public Operation getOperation() {
    return operation;
  }

  /**
   * Output only. An operation that indicates the status of the current scan. This field is
   * deprecated, do not use.
   * @param operation operation or {@code null} for none
   */
  public Discovered setOperation(Operation operation) {
    this.operation = operation;
    return this;
  }

  @Override
  public Discovered set(String fieldName, Object value) {
    return (Discovered) super.set(fieldName, value);
  }

  @Override
  public Discovered clone() {
    return (Discovered) super.clone();
  }

}
