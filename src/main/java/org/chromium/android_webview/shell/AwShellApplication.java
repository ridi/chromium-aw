// Copyright 2012 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.android_webview.shell;

import android.content.Context;
import android.support.multidex.MultiDex;

import org.chromium.base.*;
import org.chromium.base.BuildConfig;
import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.content.app.ContentApplication;

/**
 * The android_webview shell Application subclass.
 */
public class AwShellApplication extends ContentApplication {
    public AwShellApplication() {
        super(false /* mShouldInitializeApplicationStatusTracking */);
    }

    @SuppressFBWarnings("DMI_HARDCODED_ABSOLUTE_FILENAME")
    @Override
    public void initCommandLine() {
        if (!CommandLine.isInitialized()) {
            CommandLine.initFromFile("/data/local/tmp/android-webview-command-line");
        }
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        if (BuildConfig.isMultidexEnabled()) {
            MultiDex.install(this);
        }
    }
}
