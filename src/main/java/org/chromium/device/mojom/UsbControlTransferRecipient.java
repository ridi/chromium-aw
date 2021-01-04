
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     device/usb/public/mojom/device.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class UsbControlTransferRecipient {


    public static final int DEVICE = 0;

    public static final int INTERFACE = DEVICE + 1;

    public static final int ENDPOINT = INTERFACE + 1;

    public static final int OTHER = ENDPOINT + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private UsbControlTransferRecipient() {}

}