// LoadTimingInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/load_timing_info.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class LoadTimingInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 152;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(152, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean socketReused;
    public int socketLogId;
    public org.chromium.mojo_base.mojom.Time requestStartTime;
    public org.chromium.mojo_base.mojom.TimeTicks requestStart;
    public org.chromium.mojo_base.mojom.TimeTicks proxyResolveStart;
    public org.chromium.mojo_base.mojom.TimeTicks proxyResolveEnd;
    public LoadTimingInfoConnectTiming connectTiming;
    public org.chromium.mojo_base.mojom.TimeTicks sendStart;
    public org.chromium.mojo_base.mojom.TimeTicks sendEnd;
    public org.chromium.mojo_base.mojom.TimeTicks receiveHeadersStart;
    public org.chromium.mojo_base.mojom.TimeTicks receiveHeadersEnd;
    public org.chromium.mojo_base.mojom.TimeTicks receiveNonInformationalHeadersStart;
    public org.chromium.mojo_base.mojom.TimeTicks firstEarlyHintsTime;
    public org.chromium.mojo_base.mojom.TimeTicks pushStart;
    public org.chromium.mojo_base.mojom.TimeTicks pushEnd;
    public org.chromium.mojo_base.mojom.TimeTicks serviceWorkerStartTime;
    public org.chromium.mojo_base.mojom.TimeTicks serviceWorkerReadyTime;
    public org.chromium.mojo_base.mojom.TimeTicks serviceWorkerFetchStart;
    public org.chromium.mojo_base.mojom.TimeTicks serviceWorkerRespondWithSettled;

    private LoadTimingInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public LoadTimingInfo() {
        this(0);
    }

    public static LoadTimingInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static LoadTimingInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static LoadTimingInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        LoadTimingInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new LoadTimingInfo(elementsOrVersion);
                {
                    
                result.socketReused = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.socketLogId = decoder0.readInt(12);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.requestStartTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.requestStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.proxyResolveStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.proxyResolveEnd = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.connectTiming = LoadTimingInfoConnectTiming.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.sendStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                result.sendEnd = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, false);
                result.receiveHeadersStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, false);
                result.receiveHeadersEnd = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, false);
                result.receiveNonInformationalHeadersStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, false);
                result.firstEarlyHintsTime = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(104, false);
                result.pushStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(112, false);
                result.pushEnd = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(120, false);
                result.serviceWorkerStartTime = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(128, false);
                result.serviceWorkerReadyTime = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(136, false);
                result.serviceWorkerFetchStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(144, false);
                result.serviceWorkerRespondWithSettled = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
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
        
        encoder0.encode(this.socketReused, 8, 0);
        
        encoder0.encode(this.socketLogId, 12);
        
        encoder0.encode(this.requestStartTime, 16, false);
        
        encoder0.encode(this.requestStart, 24, false);
        
        encoder0.encode(this.proxyResolveStart, 32, false);
        
        encoder0.encode(this.proxyResolveEnd, 40, false);
        
        encoder0.encode(this.connectTiming, 48, false);
        
        encoder0.encode(this.sendStart, 56, false);
        
        encoder0.encode(this.sendEnd, 64, false);
        
        encoder0.encode(this.receiveHeadersStart, 72, false);
        
        encoder0.encode(this.receiveHeadersEnd, 80, false);
        
        encoder0.encode(this.receiveNonInformationalHeadersStart, 88, false);
        
        encoder0.encode(this.firstEarlyHintsTime, 96, false);
        
        encoder0.encode(this.pushStart, 104, false);
        
        encoder0.encode(this.pushEnd, 112, false);
        
        encoder0.encode(this.serviceWorkerStartTime, 120, false);
        
        encoder0.encode(this.serviceWorkerReadyTime, 128, false);
        
        encoder0.encode(this.serviceWorkerFetchStart, 136, false);
        
        encoder0.encode(this.serviceWorkerRespondWithSettled, 144, false);
    }
}