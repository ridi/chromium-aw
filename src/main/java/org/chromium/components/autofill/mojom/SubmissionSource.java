
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/autofill/core/common/mojom/autofill_types.mojom
//

package org.chromium.autofill.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class SubmissionSource {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int NONE = 0;
    public static final int SAME_DOCUMENT_NAVIGATION = 1; // NONE + 1
    public static final int XHR_SUCCEEDED = 2; // SAME_DOCUMENT_NAVIGATION + 1
    public static final int FRAME_DETACHED = 3; // XHR_SUCCEEDED + 1
    public static final int DOM_MUTATION_AFTER_XHR = 4; // FRAME_DETACHED + 1
    public static final int PROBABLY_FORM_SUBMITTED = 5; // DOM_MUTATION_AFTER_XHR + 1
    public static final int FORM_SUBMISSION = 6; // PROBABLY_FORM_SUBMITTED + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 6;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new DeserializationException("Invalid enum value.");
    }

    private SubmissionSource() {}
}