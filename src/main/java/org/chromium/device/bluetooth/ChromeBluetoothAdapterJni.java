package org.chromium.device.bluetooth;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ChromeBluetoothAdapterJni implements ChromeBluetoothAdapter.Natives {
  private static ChromeBluetoothAdapter.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothAdapter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onScanFailed(long nativeBluetoothAdapterAndroid, ChromeBluetoothAdapter caller) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothAdapter_onScanFailed(nativeBluetoothAdapterAndroid, caller);
  }

  @Override
  public void createOrUpdateDeviceOnScan(long nativeBluetoothAdapterAndroid,
      ChromeBluetoothAdapter caller, String address, Wrappers.BluetoothDeviceWrapper deviceWrapper,
      String localName, int rssi, String[] advertisedUuids, int txPower, String[] serviceDataKeys,
      Object[] serviceDataValues, int[] manufacturerDataKeys, Object[] manufacturerDataValues,
      int advertiseFlags) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothAdapter_createOrUpdateDeviceOnScan(nativeBluetoothAdapterAndroid, caller, address, deviceWrapper, localName, rssi, advertisedUuids, txPower, serviceDataKeys, serviceDataValues, manufacturerDataKeys, manufacturerDataValues, advertiseFlags);
  }

  @Override
  public void onAdapterStateChanged(long nativeBluetoothAdapterAndroid,
      ChromeBluetoothAdapter caller, boolean powered) {
    GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothAdapter_onAdapterStateChanged(nativeBluetoothAdapterAndroid, caller, powered);
  }

  public static ChromeBluetoothAdapter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBluetoothAdapterJni();
  }
}
