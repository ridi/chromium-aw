// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.power_scheduler;

/**
 * Constants for the names of PowerScheduler Features.
 */
public final class PowerSchedulerFeatures {


    // This following string constants were inserted by
    //     java_cpp_features.py
    // From
    //     ../../components/power_scheduler/power_scheduler_features.cc
    // Into
    //     ../../components/power_scheduler/java/src/org/chromium/components/power_scheduler/PowerSchedulerFeatures.java.tmpl

    // Enables the power scheduler. Defaults to throttling when idle or in no-op
    // animations, if at least 250ms of CPU time were spent in the first 500ms after
    // entering idle/no-op animation mode. Can be further configured via field trial
    // parameters, see power_scheduler.h/cc for details.
    public static final String POWER_SCHEDULER = "PowerScheduler";

    // Restricts all of Chrome's threads to use only LITTLE cores on big.LITTLE
    // architectures.
    public static final String CPU_AFFINITY_RESTRICT_TO_LITTLE_CORES = "CpuAffinityRestrictToLittleCores";

    // Restricts all of Chrome's threads to use only LITTLE cores on big.LITTLE
    // architectures when the detected PowerMode is kIdle or kBackground.
    public static final String POWER_SCHEDULER_THROTTLE_IDLE = "PowerSchedulerThrottleIdle";

    // Restricts all of Chrome's threads to use only LITTLE cores on big.LITTLE
    // architectures when the detected PowerMode is kIdle, kBackground, or
    // kNopAnimation.
    public static final String POWER_SCHEDULER_THROTTLE_IDLE_AND_NOP_ANIMATION = "PowerSchedulerThrottleIdleAndNopAnimation";

    // Restricts WebView child processes to use only LITTLE cores on big.LITTLE
    // architectures.
    public static final String WEBVIEW_CPU_AFFINITY_RESTRICT_TO_LITTLE_CORES = "WebViewCpuAffinityRestrictToLittleCores";

    // Restricts all of WebView's out-of-process renderer threads to use only LITTLE
    // cores on big.LITTLE architectures when the power mode is idle.
    public static final String WEBVIEW_POWER_SCHEDULER_THROTTLE_IDLE = "WebViewPowerSchedulerThrottleIdle";

    // Prevent instantiation.
    private PowerSchedulerFeatures() {}
}
