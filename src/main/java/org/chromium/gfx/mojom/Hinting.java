// Hinting.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/font_render_params.mojom
//

package org.chromium.gfx.mojom;

public final class Hinting {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int NONE = 0;
    public static final int SLIGHT = 1;
    public static final int MEDIUM = 2;
    public static final int FULL = 3;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private Hinting() {}
}