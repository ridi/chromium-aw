// FingerprintObserver_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/fingerprint.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


class FingerprintObserver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<FingerprintObserver, FingerprintObserver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<FingerprintObserver, FingerprintObserver.Proxy>() {

        @Override
        public String getName() {
            return "device.mojom.FingerprintObserver";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, FingerprintObserver impl) {
            return new Stub(core, impl);
        }

        @Override
        public FingerprintObserver[] buildArray(int size) {
          return new FingerprintObserver[size];
        }
    };


    private static final int ON_RESTARTED_ORDINAL = 0;

    private static final int ON_ENROLL_SCAN_DONE_ORDINAL = 1;

    private static final int ON_AUTH_SCAN_DONE_ORDINAL = 2;

    private static final int ON_SESSION_FAILED_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements FingerprintObserver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onRestarted(
) {

            FingerprintObserverOnRestartedParams _message = new FingerprintObserverOnRestartedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RESTARTED_ORDINAL)));

        }


        @Override
        public void onEnrollScanDone(
int scanResult, boolean isComplete, int percentComplete) {

            FingerprintObserverOnEnrollScanDoneParams _message = new FingerprintObserverOnEnrollScanDoneParams();

            _message.scanResult = scanResult;

            _message.isComplete = isComplete;

            _message.percentComplete = percentComplete;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_ENROLL_SCAN_DONE_ORDINAL)));

        }


        @Override
        public void onAuthScanDone(
int scanResult, java.util.Map<String, String[]> matches) {

            FingerprintObserverOnAuthScanDoneParams _message = new FingerprintObserverOnAuthScanDoneParams();

            _message.scanResult = scanResult;

            _message.matches = matches;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_AUTH_SCAN_DONE_ORDINAL)));

        }


        @Override
        public void onSessionFailed(
) {

            FingerprintObserverOnSessionFailedParams _message = new FingerprintObserverOnSessionFailedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SESSION_FAILED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<FingerprintObserver> {

        Stub(org.chromium.mojo.system.Core core, FingerprintObserver impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                FingerprintObserver_Internal.MANAGER, messageWithHeader);





                    case ON_RESTARTED_ORDINAL: {

                        FingerprintObserverOnRestartedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onRestarted();
                        return true;
                    }





                    case ON_ENROLL_SCAN_DONE_ORDINAL: {

                        FingerprintObserverOnEnrollScanDoneParams data =
                                FingerprintObserverOnEnrollScanDoneParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onEnrollScanDone(data.scanResult, data.isComplete, data.percentComplete);
                        return true;
                    }





                    case ON_AUTH_SCAN_DONE_ORDINAL: {

                        FingerprintObserverOnAuthScanDoneParams data =
                                FingerprintObserverOnAuthScanDoneParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onAuthScanDone(data.scanResult, data.matches);
                        return true;
                    }





                    case ON_SESSION_FAILED_ORDINAL: {

                        FingerprintObserverOnSessionFailedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSessionFailed();
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

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), FingerprintObserver_Internal.MANAGER, messageWithHeader, receiver);










                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class FingerprintObserverOnRestartedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private FingerprintObserverOnRestartedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FingerprintObserverOnRestartedParams() {
            this(0);
        }

        public static FingerprintObserverOnRestartedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FingerprintObserverOnRestartedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FingerprintObserverOnRestartedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FingerprintObserverOnRestartedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FingerprintObserverOnRestartedParams(elementsOrVersion);

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



    
    static final class FingerprintObserverOnEnrollScanDoneParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int scanResult;
        public boolean isComplete;
        public int percentComplete;

        private FingerprintObserverOnEnrollScanDoneParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FingerprintObserverOnEnrollScanDoneParams() {
            this(0);
        }

        public static FingerprintObserverOnEnrollScanDoneParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FingerprintObserverOnEnrollScanDoneParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FingerprintObserverOnEnrollScanDoneParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FingerprintObserverOnEnrollScanDoneParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FingerprintObserverOnEnrollScanDoneParams(elementsOrVersion);
                    {
                        
                    result.scanResult = decoder0.readInt(8);
                        ScanResult.validate(result.scanResult);
                        result.scanResult = ScanResult.toKnownValue(result.scanResult);
                    }
                    {
                        
                    result.isComplete = decoder0.readBoolean(12, 0);
                    }
                    {
                        
                    result.percentComplete = decoder0.readInt(16);
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
            
            encoder0.encode(this.scanResult, 8);
            
            encoder0.encode(this.isComplete, 12, 0);
            
            encoder0.encode(this.percentComplete, 16);
        }
    }



    
    static final class FingerprintObserverOnAuthScanDoneParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int scanResult;
        public java.util.Map<String, String[]> matches;

        private FingerprintObserverOnAuthScanDoneParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FingerprintObserverOnAuthScanDoneParams() {
            this(0);
        }

        public static FingerprintObserverOnAuthScanDoneParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FingerprintObserverOnAuthScanDoneParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FingerprintObserverOnAuthScanDoneParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FingerprintObserverOnAuthScanDoneParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FingerprintObserverOnAuthScanDoneParams(elementsOrVersion);
                    {
                        
                    result.scanResult = decoder0.readInt(8);
                        ScanResult.validate(result.scanResult);
                        result.scanResult = ScanResult.toKnownValue(result.scanResult);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    {
                        decoder1.readDataHeaderForMap();
                        String[] keys0;
                        String[][] values0;
                        {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                            {
                                org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                                keys0 = new String[si2.elementsOrVersion];
                                for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                    
                                    keys0[i2] = decoder2.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                }
                            }
                        }
                        {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                            {
                                org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                                values0 = new String[si2.elementsOrVersion][];
                                for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                    
                                    org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                    {
                                        org.chromium.mojo.bindings.DataHeader si3 = decoder3.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                                        values0[i2] = new String[si3.elementsOrVersion];
                                        for (int i3 = 0; i3 < si3.elementsOrVersion; ++i3) {
                                            
                                            values0[i2][i3] = decoder3.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i3, false);
                                        }
                                    }
                                }
                            }
                        }
                        result.matches = new java.util.HashMap<String, String[]>();
                        for (int index0 = 0; index0 < keys0.length; ++index0) {
                            result.matches.put(keys0[index0],  values0[index0]);
                        }
                    }
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
            
            encoder0.encode(this.scanResult, 8);
            
            if (this.matches == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(16);
                int size0 = this.matches.size();
                String[] keys0 = new String[size0];
                String[][] values0 = new String[size0][];
                int index0 = 0;
                for (java.util.Map.Entry<String, String[]> entry0 : this.matches.entrySet()) {
                    keys0[index0] = entry0.getKey();
                    values0[index0] = entry0.getValue();
                    ++index0;
                }
                
                {
                    org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i1 = 0; i1 < keys0.length; ++i1) {
                        
                        encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                
                {
                    org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i1 = 0; i1 < values0.length; ++i1) {
                        
                        if (values0[i1] == null) {
                            encoder2.encodeNullPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        } else {
                            org.chromium.mojo.bindings.Encoder encoder3 = encoder2.encodePointerArray(values0[i1].length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            for (int i2 = 0; i2 < values0[i1].length; ++i2) {
                                
                                encoder3.encode(values0[i1][i2], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                            }
                        }
                    }
                }
            }
        }
    }



    
    static final class FingerprintObserverOnSessionFailedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private FingerprintObserverOnSessionFailedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FingerprintObserverOnSessionFailedParams() {
            this(0);
        }

        public static FingerprintObserverOnSessionFailedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FingerprintObserverOnSessionFailedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FingerprintObserverOnSessionFailedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FingerprintObserverOnSessionFailedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FingerprintObserverOnSessionFailedParams(elementsOrVersion);

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



}
