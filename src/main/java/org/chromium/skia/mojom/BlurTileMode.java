
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     skia/public/interfaces/blur_image_filter_tile_mode.mojom
//

package org.chromium.skia.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class BlurTileMode {


    public static final int CLAMP = 0;

    public static final int REPEAT = CLAMP + 1;

    public static final int CLAMP_TO_BLACK = REPEAT + 1;

    public static final int BLUR_TILE_MODE_LAST = (int) (BlurTileMode.CLAMP_TO_BLACK);


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private BlurTileMode() {}

}