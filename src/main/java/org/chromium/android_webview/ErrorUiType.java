
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../android_webview/browser/aw_safe_browsing_blocking_page.h

package org.chromium.android_webview;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ErrorUiType.LOUD, ErrorUiType.QUIET_SMALL, ErrorUiType.QUIET_GIANT, ErrorUiType.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface ErrorUiType {
  int LOUD = 0;
  int QUIET_SMALL = 1;
  int QUIET_GIANT = 2;
  int COUNT = 3;
}
