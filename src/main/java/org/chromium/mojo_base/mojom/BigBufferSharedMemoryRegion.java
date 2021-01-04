
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/big_buffer.mojom
//

package org.chromium.mojo_base.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class BigBufferSharedMemoryRegion extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo.system.SharedBufferHandle bufferHandle;
    public int size;

    private BigBufferSharedMemoryRegion(int version) {
        super(STRUCT_SIZE, version);
        this.bufferHandle = org.chromium.mojo.system.InvalidHandle.INSTANCE;
    }

    public BigBufferSharedMemoryRegion() {
        this(0);
    }

    public static BigBufferSharedMemoryRegion deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BigBufferSharedMemoryRegion deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BigBufferSharedMemoryRegion decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BigBufferSharedMemoryRegion result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BigBufferSharedMemoryRegion(elementsOrVersion);
                {
                    
                result.bufferHandle = decoder0.readSharedBufferHandle(8, false);
                }
                {
                    
                result.size = decoder0.readInt(12);
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
        
        encoder0.encode(this.bufferHandle, 8, false);
        
        encoder0.encode(this.size, 12);
    }
}