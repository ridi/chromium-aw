package org.chromium.midi;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class UsbMidiDeviceAndroidJni implements UsbMidiDeviceAndroid.Natives {
  private static UsbMidiDeviceAndroid.Natives testInstance;

  public static final JniStaticTestMocker<UsbMidiDeviceAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.midi.UsbMidiDeviceAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.midi.UsbMidiDeviceAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onData(long nativeUsbMidiDeviceAndroid, int endpointNumber, byte[] data) {
    GEN_JNI.org_chromium_midi_UsbMidiDeviceAndroid_onData(nativeUsbMidiDeviceAndroid, endpointNumber, data);
  }

  public static UsbMidiDeviceAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.UsbMidiDeviceAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UsbMidiDeviceAndroidJni();
  }
}
