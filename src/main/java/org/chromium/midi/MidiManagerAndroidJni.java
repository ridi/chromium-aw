package org.chromium.midi;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class MidiManagerAndroidJni implements MidiManagerAndroid.Natives {
  private static MidiManagerAndroid.Natives testInstance;

  public static final JniStaticTestMocker<MidiManagerAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.midi.MidiManagerAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.midi.MidiManagerAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onInitialized(long nativeMidiManagerAndroid, MidiDeviceAndroid[] devices) {
    GEN_JNI.org_chromium_midi_MidiManagerAndroid_onInitialized(nativeMidiManagerAndroid, devices);
  }

  @Override
  public void onInitializationFailed(long nativeMidiManagerAndroid) {
    GEN_JNI.org_chromium_midi_MidiManagerAndroid_onInitializationFailed(nativeMidiManagerAndroid);
  }

  @Override
  public void onAttached(long nativeMidiManagerAndroid, MidiDeviceAndroid device) {
    GEN_JNI.org_chromium_midi_MidiManagerAndroid_onAttached(nativeMidiManagerAndroid, device);
  }

  @Override
  public void onDetached(long nativeMidiManagerAndroid, MidiDeviceAndroid device) {
    GEN_JNI.org_chromium_midi_MidiManagerAndroid_onDetached(nativeMidiManagerAndroid, device);
  }

  public static MidiManagerAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.MidiManagerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MidiManagerAndroidJni();
  }
}
