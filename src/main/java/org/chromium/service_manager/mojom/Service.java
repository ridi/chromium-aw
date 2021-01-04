// Service.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/service_manager/public/mojom/service.mojom
//

package org.chromium.service_manager.mojom;


public interface Service extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends Service, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Service, Service.Proxy> MANAGER = Service_Internal.MANAGER;


    void onStart(
Identity identity, 
OnStartResponse callback);

    interface OnStartResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<org.chromium.mojo.bindings.InterfaceRequest<Connector>, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported> { }



    void onBindInterface(
BindSourceInfo source, String interfaceName, org.chromium.mojo.system.MessagePipeHandle interfacePipe, 
OnBindInterfaceResponse callback);

    interface OnBindInterfaceResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void createPackagedServiceInstance(
Identity identity, org.chromium.mojo.bindings.InterfaceRequest<Service> receiver, ProcessMetadata metadata);


}
