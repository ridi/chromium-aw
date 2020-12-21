// SerialPort.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/serial.mojom
//

package org.chromium.device.mojom;


public interface SerialPort extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SerialPort, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SerialPort, SerialPort.Proxy> MANAGER = SerialPort_Internal.MANAGER;


    void open(
SerialConnectionOptions options, SerialPortClient client, 
OpenResponse callback);

    interface OpenResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void startWriting(
org.chromium.mojo.system.DataPipe.ConsumerHandle consumer);



    void startReading(
org.chromium.mojo.system.DataPipe.ProducerHandle producer);



    void flush(

FlushResponse callback);

    interface FlushResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void getControlSignals(

GetControlSignalsResponse callback);

    interface GetControlSignalsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<SerialPortControlSignals> { }



    void setControlSignals(
SerialHostControlSignals signals, 
SetControlSignalsResponse callback);

    interface SetControlSignalsResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void configurePort(
SerialConnectionOptions options, 
ConfigurePortResponse callback);

    interface ConfigurePortResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void getPortInfo(

GetPortInfoResponse callback);

    interface GetPortInfoResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<SerialConnectionInfo> { }



    void close(

CloseResponse callback);

    interface CloseResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
