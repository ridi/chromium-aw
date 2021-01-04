
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     device/usb/public/mojom/device_manager.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface UsbDeviceManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends UsbDeviceManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<UsbDeviceManager, UsbDeviceManager.Proxy> MANAGER = UsbDeviceManager_Internal.MANAGER;


    void getDevices(
UsbEnumerationOptions options, 
GetDevicesResponse callback);

    interface GetDevicesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<UsbDeviceInfo[]> { }



    void getDevice(
String guid, org.chromium.mojo.bindings.InterfaceRequest<UsbDevice> deviceRequest, UsbDeviceClient deviceClient);



    void setClient(
UsbDeviceManagerClient client);


}
