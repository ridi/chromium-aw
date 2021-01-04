
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/screen_orientation.mojom
//

package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class ScreenOrientationListener_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ScreenOrientationListener, ScreenOrientationListener.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ScreenOrientationListener, ScreenOrientationListener.Proxy>() {

        @Override
        public String getName() {
            return "device.mojom.ScreenOrientationListener";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, ScreenOrientationListener impl) {
            return new Stub(core, impl);
        }

        @Override
        public ScreenOrientationListener[] buildArray(int size) {
          return new ScreenOrientationListener[size];
        }
    };


    private static final int IS_AUTO_ROTATE_ENABLED_BY_USER_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ScreenOrientationListener.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void isAutoRotateEnabledByUser(

IsAutoRotateEnabledByUserResponse callback) {

            ScreenOrientationListenerIsAutoRotateEnabledByUserParams _message = new ScreenOrientationListenerIsAutoRotateEnabledByUserParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    IS_AUTO_ROTATE_ENABLED_BY_USER_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ScreenOrientationListener> {

        Stub(org.chromium.mojo.system.Core core, ScreenOrientationListener impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                ScreenOrientationListener_Internal.MANAGER, messageWithHeader);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), ScreenOrientationListener_Internal.MANAGER, messageWithHeader, receiver);







                    case IS_AUTO_ROTATE_ENABLED_BY_USER_ORDINAL: {

                        ScreenOrientationListenerIsAutoRotateEnabledByUserParams.deserialize(messageWithHeader.getPayload());

                        getImpl().isAutoRotateEnabledByUser(new ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class ScreenOrientationListenerIsAutoRotateEnabledByUserParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private ScreenOrientationListenerIsAutoRotateEnabledByUserParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ScreenOrientationListenerIsAutoRotateEnabledByUserParams() {
            this(0);
        }

        public static ScreenOrientationListenerIsAutoRotateEnabledByUserParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ScreenOrientationListenerIsAutoRotateEnabledByUserParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ScreenOrientationListenerIsAutoRotateEnabledByUserParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ScreenOrientationListenerIsAutoRotateEnabledByUserParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ScreenOrientationListenerIsAutoRotateEnabledByUserParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean enabled;

        private ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams() {
            this(0);
        }

        public static ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams(elementsOrVersion);
                    {
                        
                    result.enabled = decoder0.readBoolean(8, 0);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.enabled, 8, 0);
        }
    }

    static class ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final ScreenOrientationListener.IsAutoRotateEnabledByUserResponse mCallback;

        ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParamsForwardToCallback(ScreenOrientationListener.IsAutoRotateEnabledByUserResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(IS_AUTO_ROTATE_ENABLED_BY_USER_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams response = ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.enabled);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParamsProxyToResponder implements ScreenOrientationListener.IsAutoRotateEnabledByUserResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Boolean enabled) {
            ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams _response = new ScreenOrientationListenerIsAutoRotateEnabledByUserResponseParams();

            _response.enabled = enabled;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    IS_AUTO_ROTATE_ENABLED_BY_USER_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
