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
 * Cloud Autoscaler policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoscalingPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The number of seconds that the autoscaler waits before it starts collecting information from a
   * new instance. This prevents the autoscaler from collecting information when the instance is
   * initializing, during which the collected usage would not be reliable. The default time
   * autoscaler waits is 60 seconds.
   *
   * Virtual machine initialization times might vary because of numerous factors. We recommend that
   * you test how long an instance may take to initialize. To do this, create an instance and time
   * the startup process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer coolDownPeriodSec;

  /**
   * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU
   * utilization of a managed instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoscalingPolicyCpuUtilization cpuUtilization;

  /**
   * Configuration parameters of autoscaling based on a custom metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AutoscalingPolicyCustomMetricUtilization> customMetricUtilizations;

  /**
   * Configuration parameters of autoscaling based on load balancer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoscalingPolicyLoadBalancingUtilization loadBalancingUtilization;

  /**
   * The maximum number of instances that the autoscaler can scale out to. This is required when
   * creating or updating an autoscaler. The maximum number of replicas must not be lower than
   * minimal number of replicas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxNumReplicas;

  /**
   * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0.
   * If not provided, autoscaler chooses a default value depending on maximum number of instances
   * allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNumReplicas;

  /**
   * Defines operating mode for this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoscalingPolicyScaleDownControl scaleDownControl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AutoscalingPolicyScaleInControl scaleInControl;

  /**
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler,
   * and they can overlap. During overlapping periods the greatest min_required_replicas of all
   * scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AutoscalingPolicyScalingSchedule> scalingSchedules;

  /**
   * The number of seconds that the autoscaler waits before it starts collecting information from a
   * new instance. This prevents the autoscaler from collecting information when the instance is
   * initializing, during which the collected usage would not be reliable. The default time
   * autoscaler waits is 60 seconds.
   *
   * Virtual machine initialization times might vary because of numerous factors. We recommend that
   * you test how long an instance may take to initialize. To do this, create an instance and time
   * the startup process.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCoolDownPeriodSec() {
    return coolDownPeriodSec;
  }

  /**
   * The number of seconds that the autoscaler waits before it starts collecting information from a
   * new instance. This prevents the autoscaler from collecting information when the instance is
   * initializing, during which the collected usage would not be reliable. The default time
   * autoscaler waits is 60 seconds.
   *
   * Virtual machine initialization times might vary because of numerous factors. We recommend that
   * you test how long an instance may take to initialize. To do this, create an instance and time
   * the startup process.
   * @param coolDownPeriodSec coolDownPeriodSec or {@code null} for none
   */
  public AutoscalingPolicy setCoolDownPeriodSec(java.lang.Integer coolDownPeriodSec) {
    this.coolDownPeriodSec = coolDownPeriodSec;
    return this;
  }

  /**
   * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU
   * utilization of a managed instance group.
   * @return value or {@code null} for none
   */
  public AutoscalingPolicyCpuUtilization getCpuUtilization() {
    return cpuUtilization;
  }

  /**
   * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU
   * utilization of a managed instance group.
   * @param cpuUtilization cpuUtilization or {@code null} for none
   */
  public AutoscalingPolicy setCpuUtilization(AutoscalingPolicyCpuUtilization cpuUtilization) {
    this.cpuUtilization = cpuUtilization;
    return this;
  }

  /**
   * Configuration parameters of autoscaling based on a custom metric.
   * @return value or {@code null} for none
   */
  public java.util.List<AutoscalingPolicyCustomMetricUtilization> getCustomMetricUtilizations() {
    return customMetricUtilizations;
  }

  /**
   * Configuration parameters of autoscaling based on a custom metric.
   * @param customMetricUtilizations customMetricUtilizations or {@code null} for none
   */
  public AutoscalingPolicy setCustomMetricUtilizations(java.util.List<AutoscalingPolicyCustomMetricUtilization> customMetricUtilizations) {
    this.customMetricUtilizations = customMetricUtilizations;
    return this;
  }

  /**
   * Configuration parameters of autoscaling based on load balancer.
   * @return value or {@code null} for none
   */
  public AutoscalingPolicyLoadBalancingUtilization getLoadBalancingUtilization() {
    return loadBalancingUtilization;
  }

  /**
   * Configuration parameters of autoscaling based on load balancer.
   * @param loadBalancingUtilization loadBalancingUtilization or {@code null} for none
   */
  public AutoscalingPolicy setLoadBalancingUtilization(AutoscalingPolicyLoadBalancingUtilization loadBalancingUtilization) {
    this.loadBalancingUtilization = loadBalancingUtilization;
    return this;
  }

  /**
   * The maximum number of instances that the autoscaler can scale out to. This is required when
   * creating or updating an autoscaler. The maximum number of replicas must not be lower than
   * minimal number of replicas.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxNumReplicas() {
    return maxNumReplicas;
  }

  /**
   * The maximum number of instances that the autoscaler can scale out to. This is required when
   * creating or updating an autoscaler. The maximum number of replicas must not be lower than
   * minimal number of replicas.
   * @param maxNumReplicas maxNumReplicas or {@code null} for none
   */
  public AutoscalingPolicy setMaxNumReplicas(java.lang.Integer maxNumReplicas) {
    this.maxNumReplicas = maxNumReplicas;
    return this;
  }

  /**
   * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0.
   * If not provided, autoscaler chooses a default value depending on maximum number of instances
   * allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNumReplicas() {
    return minNumReplicas;
  }

  /**
   * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0.
   * If not provided, autoscaler chooses a default value depending on maximum number of instances
   * allowed.
   * @param minNumReplicas minNumReplicas or {@code null} for none
   */
  public AutoscalingPolicy setMinNumReplicas(java.lang.Integer minNumReplicas) {
    this.minNumReplicas = minNumReplicas;
    return this;
  }

  /**
   * Defines operating mode for this policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * Defines operating mode for this policy.
   * @param mode mode or {@code null} for none
   */
  public AutoscalingPolicy setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AutoscalingPolicyScaleDownControl getScaleDownControl() {
    return scaleDownControl;
  }

  /**
   * @param scaleDownControl scaleDownControl or {@code null} for none
   */
  public AutoscalingPolicy setScaleDownControl(AutoscalingPolicyScaleDownControl scaleDownControl) {
    this.scaleDownControl = scaleDownControl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AutoscalingPolicyScaleInControl getScaleInControl() {
    return scaleInControl;
  }

  /**
   * @param scaleInControl scaleInControl or {@code null} for none
   */
  public AutoscalingPolicy setScaleInControl(AutoscalingPolicyScaleInControl scaleInControl) {
    this.scaleInControl = scaleInControl;
    return this;
  }

  /**
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler,
   * and they can overlap. During overlapping periods the greatest min_required_replicas of all
   * scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AutoscalingPolicyScalingSchedule> getScalingSchedules() {
    return scalingSchedules;
  }

  /**
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler,
   * and they can overlap. During overlapping periods the greatest min_required_replicas of all
   * scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * @param scalingSchedules scalingSchedules or {@code null} for none
   */
  public AutoscalingPolicy setScalingSchedules(java.util.Map<String, AutoscalingPolicyScalingSchedule> scalingSchedules) {
    this.scalingSchedules = scalingSchedules;
    return this;
  }

  @Override
  public AutoscalingPolicy set(String fieldName, Object value) {
    return (AutoscalingPolicy) super.set(fieldName, value);
  }

  @Override
  public AutoscalingPolicy clone() {
    return (AutoscalingPolicy) super.clone();
  }

}
