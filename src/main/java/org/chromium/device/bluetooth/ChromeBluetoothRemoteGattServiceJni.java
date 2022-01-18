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
class ChromeBluetoothRemoteGattServiceJni implements ChromeBluetoothRemoteGattService.Natives {
  private static ChromeBluetoothRemoteGattService.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothRemoteGattService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothRemoteGattService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothRemoteGattService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void createGattRemoteCharacteristic(long nativeBluetoothRemoteGattServiceAndroid,
      ChromeBluetoothRemoteGattService caller, String instanceId,
      Wrappers.BluetoothGattCharacteristicWrapper characteristicWrapper,
      ChromeBluetoothDevice chromeBluetoothDevice) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattService_createGattRemoteCharacteristic(nativeBluetoothRemoteGattServiceAndroid, caller, instanceId, characteristicWrapper, chromeBluetoothDevice);
  }

  public static ChromeBluetoothRemoteGattService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBluetoothRemoteGattServiceJni();
  }
}
