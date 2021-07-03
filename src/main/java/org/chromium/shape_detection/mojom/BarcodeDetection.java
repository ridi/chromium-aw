// BarcodeDetection.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/shape_detection/public/mojom/barcodedetection.mojom
//

package org.chromium.shape_detection.mojom;

import androidx.annotation.IntDef;


public interface BarcodeDetection extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends BarcodeDetection, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BarcodeDetection, BarcodeDetection.Proxy> MANAGER = BarcodeDetection_Internal.MANAGER;


    void detect(
org.chromium.skia.mojom.BitmapN32 bitmapData, 
DetectResponse callback);

    interface DetectResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<BarcodeDetectionResult[]> { }


}
