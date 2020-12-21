// TextInputType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/base/ime/mojom/ime_types.mojom
//

package org.chromium.ui.mojom;

public final class TextInputType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int NONE = 0;
    public static final int TEXT = 1;
    public static final int PASSWORD = 2;
    public static final int SEARCH = 3;
    public static final int EMAIL = 4;
    public static final int NUMBER = 5;
    public static final int TELEPHONE = 6;
    public static final int URL = 7;
    public static final int DATE = 8;
    public static final int DATE_TIME = 9;
    public static final int DATE_TIME_LOCAL = 10;
    public static final int MONTH = 11;
    public static final int TIME = 12;
    public static final int WEEK = 13;
    public static final int TEXT_AREA = 14;
    public static final int CONTENT_EDITABLE = 15;
    public static final int DATE_TIME_FIELD = 16;
    public static final int TYPE_NULL = 17;
    public static final int MAX = 17;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 17;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private TextInputType() {}
}