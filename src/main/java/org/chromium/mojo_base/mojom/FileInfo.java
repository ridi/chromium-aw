
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/file_info.mojom
//

package org.chromium.mojo_base.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class FileInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public long size;
    public boolean isDirectory;
    public boolean isSymbolicLink;
    public Time lastModified;
    public Time lastAccessed;
    public Time creationTime;

    private FileInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public FileInfo() {
        this(0);
    }

    public static FileInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FileInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FileInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FileInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FileInfo(elementsOrVersion);
                {
                    
                result.size = decoder0.readLong(8);
                }
                {
                    
                result.isDirectory = decoder0.readBoolean(16, 0);
                }
                {
                    
                result.isSymbolicLink = decoder0.readBoolean(16, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.lastModified = Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.lastAccessed = Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.creationTime = Time.decode(decoder1);
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
        
        encoder0.encode(this.size, 8);
        
        encoder0.encode(this.isDirectory, 16, 0);
        
        encoder0.encode(this.isSymbolicLink, 16, 1);
        
        encoder0.encode(this.lastModified, 24, false);
        
        encoder0.encode(this.lastAccessed, 32, false);
        
        encoder0.encode(this.creationTime, 40, false);
    }
}