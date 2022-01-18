package org.chromium.midi;

import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class UsbMidiDeviceFactoryAndroidJni implements UsbMidiDeviceFactoryAndroid.Natives {
  private static UsbMidiDeviceFactoryAndroid.Natives testInstance;

  public static final JniStaticTestMocker<UsbMidiDeviceFactoryAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.midi.UsbMidiDeviceFactoryAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.midi.UsbMidiDeviceFactoryAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onUsbMidiDeviceRequestDone(long nativeUsbMidiDeviceFactoryAndroid, Object[] devices) {
    GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceRequestDone(nativeUsbMidiDeviceFactoryAndroid, devices);
  }

  @Override
  public void onUsbMidiDeviceAttached(long nativeUsbMidiDeviceFactoryAndroid, Object device) {
    GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceAttached(nativeUsbMidiDeviceFactoryAndroid, device);
  }

  @Override
  public void onUsbMidiDeviceDetached(long nativeUsbMidiDeviceFactoryAndroid, int index) {
    GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceDetached(nativeUsbMidiDeviceFactoryAndroid, index);
  }

  public static UsbMidiDeviceFactoryAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.UsbMidiDeviceFactoryAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UsbMidiDeviceFactoryAndroidJni();
  }
}
