// FocusedFieldType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/autofill/core/common/mojom/autofill_types.mojom
//

package org.chromium.autofill.mojom;

public final class FocusedFieldType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNKNOWN = 0;
    public static final int UNFILLABLE_ELEMENT = 1;
    public static final int FILLABLE_TEXT_AREA = 2;
    public static final int FILLABLE_SEARCH_FIELD = 3;
    public static final int FILLABLE_NON_SEARCH_FIELD = 4;
    public static final int FILLABLE_USERNAME_FIELD = 5;
    public static final int FILLABLE_PASSWORD_FIELD = 6;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 6;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private FocusedFieldType() {}
}