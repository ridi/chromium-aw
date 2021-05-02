// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.metrics;

/**
 * Contains command line switches that are specific to the metrics component.
 */
public final class MetricsSwitches {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../components/metrics/metrics_switches.cc
    // Into
    //     ../../components/metrics/android/java_templates/MetricsSwitches.java.tmpl

    // Enables the recording of metrics reports but disables reporting. In contrast
    // to kForceEnableMetricsReporting, this executes all the code that a normal
    // client would use for reporting, except the report is dropped rather than sent
    // to the server. This is useful for finding issues in the metrics code during
    // UI and performance tests.
    public static final String METRICS_RECORDING_ONLY = "metrics-recording-only";

    // Override the standard time interval between each metrics report upload for
    // UMA and UKM. It is useful to set to a short interval for debugging. Unit in
    // seconds. (The default is 1800 seconds on desktop).
    public static final String METRICS_UPLOAD_INTERVAL_SEC = "metrics-upload-interval";

    // Forces a reset of the one-time-randomized FieldTrials on this client, also
    // known as the Chrome Variations state.
    public static final String RESET_VARIATION_STATE = "reset-variation-state";

    // Forces metrics reporting to be enabled. Should not be used for tests as it
    // will send data to servers.
    public static final String FORCE_ENABLE_METRICS_REPORTING = "force-enable-metrics-reporting";

    // Prevents instantiation.
    private MetricsSwitches() {}
}
