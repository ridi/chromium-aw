// BluetoothDeviceInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/bluetooth_system.mojom
//

package org.chromium.device.mojom;


public final class BluetoothDeviceInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class ConnectionState {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int NOT_CONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNECTED = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        private ConnectionState() {}
    }

    public static final class DeviceType {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int UNKNOWN = 0;
        public static final int COMPUTER = 1;
        public static final int PHONE = 2;
        public static final int MODEM = 3;
        public static final int AUDIO = 4;
        public static final int CAR_AUDIO = 5;
        public static final int VIDEO = 6;
        public static final int PERIPHERAL = 7;
        public static final int JOYSTICK = 8;
        public static final int GAMEPAD = 9;
        public static final int KEYBOARD = 10;
        public static final int MOUSE = 11;
        public static final int TABLET = 12;
        public static final int KEYBOARD_MOUSE_COMBO = 13;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 13;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        private DeviceType() {}
    }
    public BluetoothAddress address;
    public String name;
    public int connectionState;
    public boolean isPaired;
    public int deviceType;
    public BluetoothDeviceBatteryInfo batteryInfo;

    private BluetoothDeviceInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public BluetoothDeviceInfo() {
        this(0);
    }

    public static BluetoothDeviceInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BluetoothDeviceInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BluetoothDeviceInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BluetoothDeviceInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BluetoothDeviceInfo(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.address = BluetoothAddress.decode(decoder1);
                }
                {
                    
                result.name = decoder0.readString(16, true);
                }
                {
                    
                result.connectionState = decoder0.readInt(24);
                    BluetoothDeviceInfo.ConnectionState.validate(result.connectionState);
                }
                {
                    
                result.isPaired = decoder0.readBoolean(28, 0);
                }
                {
                    
                result.deviceType = decoder0.readInt(32);
                    BluetoothDeviceInfo.DeviceType.validate(result.deviceType);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                result.batteryInfo = BluetoothDeviceBatteryInfo.decode(decoder1);
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
        
        encoder0.encode(this.address, 8, false);
        
        encoder0.encode(this.name, 16, true);
        
        encoder0.encode(this.connectionState, 24);
        
        encoder0.encode(this.isPaired, 28, 0);
        
        encoder0.encode(this.deviceType, 32);
        
        encoder0.encode(this.batteryInfo, 40, true);
    }
}