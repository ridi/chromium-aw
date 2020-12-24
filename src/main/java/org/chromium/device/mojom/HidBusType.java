
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/hid.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class HidBusType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int HID_BUS_TYPE_USB = 0;
    public static final int HID_BUS_TYPE_BLUETOOTH = 1;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 1;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new DeserializationException("Invalid enum value.");
    }

    private HidBusType() {}
}