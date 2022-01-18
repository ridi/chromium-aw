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
class ChromeBluetoothDeviceJni implements ChromeBluetoothDevice.Natives {
  private static ChromeBluetoothDevice.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothDevice.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothDevice.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothDevice.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onConnectionStateChange(long nativeBluetoothDeviceAndroid,
      ChromeBluetoothDevice caller, int status, boolean connected) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothDevice_onConnectionStateChange(nativeBluetoothDeviceAndroid, caller, status, connected);
  }

  @Override
  public void createGattRemoteService(long nativeBluetoothDeviceAndroid,
      ChromeBluetoothDevice caller, String instanceId,
      Wrappers.BluetoothGattServiceWrapper serviceWrapper) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothDevice_createGattRemoteService(nativeBluetoothDeviceAndroid, caller, instanceId, serviceWrapper);
  }

  @Override
  public void onGattServicesDiscovered(long nativeBluetoothDeviceAndroid,
      ChromeBluetoothDevice caller) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothDevice_onGattServicesDiscovered(nativeBluetoothDeviceAndroid, caller);
  }

  public static ChromeBluetoothDevice.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothDevice.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBluetoothDeviceJni();
  }
}
