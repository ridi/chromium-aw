// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.android_webview.common;

/**
 * Contains command line switches that are specific to Android WebView.
 */
public final class AwSwitches {


    // This following string constants were inserted by
    //     java_cpp_strings.py
    // From
    //     ../../android_webview/common/aw_switches.cc
    // Into
    //     ../../android_webview/java/src/org/chromium/android_webview/common/AwSwitches.java.tmpl


    public static final String WEBVIEW_LOG_JS_CONSOLE_MESSAGES = "webview-log-js-console-messages";


    public static final String WEBVIEW_SANDBOXED_RENDERER = "webview-sandboxed-renderer";

    // used to disable safebrowsing functionality in webview
    public static final String WEBVIEW_DISABLE_SAFEBROWSING_SUPPORT = "webview-disable-safebrowsing-support";

    // Enables SafeBrowsing and causes WebView to treat all resources as malicious.
    // Use care: this will block all resources from loading.
    public static final String WEBVIEW_SAFEBROWSING_BLOCK_ALL_RESOURCES = "webview-safebrowsing-block-all-resources";

    // Highlight the contents (including web contents) of all WebViews with a yellow
    // tint. This is useful for identifying WebViews in an Android application.
    public static final String HIGHLIGHT_ALL_WEBVIEWS = "highlight-all-webviews";

    // WebView will log additional debugging information to logcat, such as
    // variations and commandline state.
    public static final String WEBVIEW_VERBOSE_LOGGING = "webview-verbose-logging";

    // The length of time in seconds that an app's copy of the variations seed
    // should be considered fresh. If an app's seed is older than this, a new seed
    // will be requested from WebView's IVariationsSeedServer.
    public static final String FINCH_SEED_EXPIRATION_AGE = "finch-seed-expiration-age";

    // Forces WebView's service to always schedule a new variations seed download
    // job, even if one is already pending.
    public static final String FINCH_SEED_IGNORE_PENDING_DOWNLOAD = "finch-seed-ignore-pending-download";

    // Forces WebView's service to always schedule a new variations seed download
    // job, even if the device is not charging. Note this switch may be necessary
    // for testing on Android emulators as these are not always considered to be
    // charging.
    public static final String FINCH_SEED_NO_CHARGING_REQUIREMENT = "finch-seed-no-charging-requirement";

    // The minimum amount of time in seconds that WebView's service will wait
    // between two variations seed downloads from the variations server.
    public static final String FINCH_SEED_MIN_DOWNLOAD_PERIOD = "finch-seed-min-download-period";

    // The minimum amount of time in seconds that the embedded WebView
    // implementation will wait between two requests to WebView's service for a new
    // variations seed.
    public static final String FINCH_SEED_MIN_UPDATE_PERIOD = "finch-seed-min-update-period";

    // Enables modern SameSite cookie behavior (as opposed to legacy behavior). This
    // is used for WebView versions prior to when the modern behavior will be
    // enabled by default. This enables the same-site-by-default-cookies,
    // cookies-without-SameSite-must-be-secure, and schemeful-same-site features.
    public static final String WEBVIEW_ENABLE_MODERN_COOKIE_SAME_SITE = "webview-enable-modern-cookie-same-site";

    // Disables downloading/updating Apps Package Names Allowlist.
    public static final String WEBVIEW_DISABLE_APPS_PACKAGE_NAMES_ALLOWLIST_COMPONENT = "disable-webview-apps-package-names-allowlist-component";

    // Do not instantiate this class.
    private AwSwitches() {}
}
