
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/nfc.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface Nfc extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends Nfc, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Nfc, Nfc.Proxy> MANAGER = Nfc_Internal.MANAGER;


    void setClient(
NfcClient client);



    void push(
NdefMessage message, NfcPushOptions options, 
PushResponse callback);

    interface PushResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<NfcError> { }



    void cancelPush(
int target, 
CancelPushResponse callback);

    interface CancelPushResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<NfcError> { }



    void watch(
NfcReaderOptions options, 
WatchResponse callback);

    interface WatchResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, NfcError> { }



    void cancelWatch(
int id, 
CancelWatchResponse callback);

    interface CancelWatchResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<NfcError> { }



    void cancelAllWatches(

CancelAllWatchesResponse callback);

    interface CancelAllWatchesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<NfcError> { }



    void suspendNfcOperations(
);



    void resumeNfcOperations(
);


}
