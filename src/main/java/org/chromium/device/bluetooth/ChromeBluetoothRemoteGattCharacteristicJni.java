package org.chromium.device.bluetooth;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ChromeBluetoothRemoteGattCharacteristicJni implements ChromeBluetoothRemoteGattCharacteristic.Natives {
  private static ChromeBluetoothRemoteGattCharacteristic.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothRemoteGattCharacteristic.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onChanged(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, byte[] value) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onChanged(nativeBluetoothRemoteGattCharacteristicAndroid, caller, value);
  }

  @Override
  public void onRead(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, int status, byte[] value) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onRead(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status, value);
  }

  @Override
  public void onWrite(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, int status) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onWrite(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status);
  }

  @Override
  public void createGattRemoteDescriptor(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, String instanceId,
      Wrappers.BluetoothGattDescriptorWrapper descriptorWrapper,
      ChromeBluetoothDevice chromeBluetoothDevice) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_createGattRemoteDescriptor(nativeBluetoothRemoteGattCharacteristicAndroid, caller, instanceId, descriptorWrapper, chromeBluetoothDevice);
  }

  public static ChromeBluetoothRemoteGattCharacteristic.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBluetoothRemoteGattCharacteristicJni();
  }
}
