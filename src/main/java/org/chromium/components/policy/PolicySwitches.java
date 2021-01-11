// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.policy;

/**
 * Contains command line switches that are specific to the policy component.
 */
public final class PolicySwitches {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../components/policy/core/common/policy_switches.cc
    // Into
    //     ../../components/policy/android/java_templates/PolicySwitches.java.tmpl

    // Specifies the URL at which to communicate with the device management backend
    // to fetch configuration policies and perform other device tasks.
    public static final String DEVICE_MANAGEMENT_URL = "device-management-url";

    // Specifies the URL at which to upload real-time reports.
    public static final String REALTIME_REPORTING_URL = "realtime-reporting-url";

    // Specifies the URL at which to upload encrypted reports.
    public static final String ENCRYPTED_REPORTING_URL = "encrypted-reporting-url";

    // Always treat user as affiliated.
    // TODO(antrim): Remove once test servers correctly produce affiliation ids.
    public static final String USER_ALWAYS_AFFILIATED = "user-always-affiliated";

    // Set policy value by command line.
    public static final String CHROME_POLICY = "policy";

    // Prevents instantiation.
    private PolicySwitches() {}
}
