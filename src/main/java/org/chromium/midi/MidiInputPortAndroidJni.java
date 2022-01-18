package org.chromium.midi;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class MidiInputPortAndroidJni implements MidiInputPortAndroid.Natives {
  private static MidiInputPortAndroid.Natives testInstance;

  public static final JniStaticTestMocker<MidiInputPortAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.midi.MidiInputPortAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.midi.MidiInputPortAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onData(long nativeMidiInputPortAndroid, byte[] bs, int offset, int count,
      long timestamp) {
    GEN_JNI.org_chromium_midi_MidiInputPortAndroid_onData(nativeMidiInputPortAndroid, bs, offset, count, timestamp);
  }

  public static MidiInputPortAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.MidiInputPortAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MidiInputPortAndroidJni();
  }
}
