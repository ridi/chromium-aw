
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/base/ime/mojo/ime_types.mojom
//

package org.chromium.ui.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class TextInputType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int NONE = 0;
    public static final int TEXT = 1; // NONE + 1
    public static final int PASSWORD = 2; // TEXT + 1
    public static final int SEARCH = 3; // PASSWORD + 1
    public static final int EMAIL = 4; // SEARCH + 1
    public static final int NUMBER = 5; // EMAIL + 1
    public static final int TELEPHONE = 6; // NUMBER + 1
    public static final int URL = 7; // TELEPHONE + 1
    public static final int DATE = 8; // URL + 1
    public static final int DATE_TIME = 9; // DATE + 1
    public static final int DATE_TIME_LOCAL = 10; // DATE_TIME + 1
    public static final int MONTH = 11; // DATE_TIME_LOCAL + 1
    public static final int TIME = 12; // MONTH + 1
    public static final int WEEK = 13; // TIME + 1
    public static final int TEXT_AREA = 14; // WEEK + 1
    public static final int CONTENT_EDITABLE = 15; // TEXT_AREA + 1
    public static final int DATE_TIME_FIELD = 16; // CONTENT_EDITABLE + 1
    public static final int MAX = TextInputType.DATE_TIME_FIELD;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 16;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new DeserializationException("Invalid enum value.");
    }

    private TextInputType() {}
}