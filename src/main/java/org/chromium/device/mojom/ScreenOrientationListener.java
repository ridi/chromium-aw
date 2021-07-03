// ScreenOrientationListener.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/screen_orientation.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public interface ScreenOrientationListener extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ScreenOrientationListener, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ScreenOrientationListener, ScreenOrientationListener.Proxy> MANAGER = ScreenOrientationListener_Internal.MANAGER;


    void isAutoRotateEnabledByUser(

IsAutoRotateEnabledByUserResponse callback);

    interface IsAutoRotateEnabledByUserResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}
