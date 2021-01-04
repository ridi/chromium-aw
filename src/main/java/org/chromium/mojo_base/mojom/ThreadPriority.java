
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/thread_priority.mojom
//

package org.chromium.mojo_base.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class ThreadPriority {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int BACKGROUND = 0;
    public static final int NORMAL = 1; // BACKGROUND + 1
    public static final int DISPLAY = 2; // NORMAL + 1
    public static final int REALTIME_AUDIO = 3; // DISPLAY + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new DeserializationException("Invalid enum value.");
    }

    private ThreadPriority() {}
}