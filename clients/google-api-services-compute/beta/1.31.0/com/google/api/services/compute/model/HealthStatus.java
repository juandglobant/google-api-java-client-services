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

package com.google.api.services.compute.model;

/**
 * Model definition for HealthStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HealthStatus extends com.google.api.client.json.GenericJson {

  /**
   * Metadata defined as annotations for network endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> annotations;

  /**
   * Health state of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthState;

  /**
   * URL of the instance resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * A forwarding rule IP address assigned to this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * The named port of the instance group, not necessarily the port that is health-checked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String weight;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String weightError;

  /**
   * Metadata defined as annotations for network endpoint.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAnnotations() {
    return annotations;
  }

  /**
   * Metadata defined as annotations for network endpoint.
   * @param annotations annotations or {@code null} for none
   */
  public HealthStatus setAnnotations(java.util.Map<String, java.lang.String> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Health state of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthState() {
    return healthState;
  }

  /**
   * Health state of the instance.
   * @param healthState healthState or {@code null} for none
   */
  public HealthStatus setHealthState(java.lang.String healthState) {
    this.healthState = healthState;
    return this;
  }

  /**
   * URL of the instance resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * URL of the instance resource.
   * @param instance instance or {@code null} for none
   */
  public HealthStatus setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * A forwarding rule IP address assigned to this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * A forwarding rule IP address assigned to this instance.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public HealthStatus setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The named port of the instance group, not necessarily the port that is health-checked.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The named port of the instance group, not necessarily the port that is health-checked.
   * @param port port or {@code null} for none
   */
  public HealthStatus setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWeight() {
    return weight;
  }

  /**
   * @param weight weight or {@code null} for none
   */
  public HealthStatus setWeight(java.lang.String weight) {
    this.weight = weight;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWeightError() {
    return weightError;
  }

  /**
   * @param weightError weightError or {@code null} for none
   */
  public HealthStatus setWeightError(java.lang.String weightError) {
    this.weightError = weightError;
    return this;
  }

  @Override
  public HealthStatus set(String fieldName, Object value) {
    return (HealthStatus) super.set(fieldName, value);
  }

  @Override
  public HealthStatus clone() {
    return (HealthStatus) super.clone();
  }

}
