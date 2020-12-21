// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.version_info;

import org.chromium.base.annotations.MainDex;

// Constants shared by Android Chrome and WebView. Chrome specific constants are
// in ChromeVersionConstants.
@MainDex
public class VersionConstants {
    public static final String PRODUCT_VERSION = "85.0.4183.162";
    @SuppressWarnings({"ComplexBooleanConstant", "IdentityBinaryExpression"})
    public static final boolean IS_OFFICIAL_BUILD = 0 == 1;

    public static final int PRODUCT_MAJOR_VERSION = 85;
    public static final int PRODUCT_BUILD_VERSION = 4183;

    public static final int CHANNEL = Channel.DEFAULT;
}
