// SubmissionIndicatorEvent.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/autofill/core/common/mojom/autofill_types.mojom
//

package org.chromium.autofill.mojom;

public final class SubmissionIndicatorEvent {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int NONE = 0;
    public static final int HTML_FORM_SUBMISSION = 1;
    public static final int SAME_DOCUMENT_NAVIGATION = 2;
    public static final int XHR_SUCCEEDED = 3;
    public static final int FRAME_DETACHED = 4;
    public static final int DOM_MUTATION_AFTER_XHR = 6;
    public static final int PROVISIONALLY_SAVED_FORM_ON_START_PROVISIONAL_LOAD = 7;
    public static final int PROBABLE_FORM_SUBMISSION = 10;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 10:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private SubmissionIndicatorEvent() {}
}