package org.chromium.midi;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MidiManagerAndroidJni implements MidiManagerAndroid.Natives {
  private static MidiManagerAndroid.Natives testInstance;

  public static final JniStaticTestMocker<MidiManagerAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.midi.MidiManagerAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.midi.MidiManagerAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onInitialized(long nativeMidiManagerAndroid, MidiDeviceAndroid[] devices) {
    N.M3znzcE9(nativeMidiManagerAndroid, devices);
  }

  @Override
  public void onInitializationFailed(long nativeMidiManagerAndroid) {
    N.MfmZ2$zu(nativeMidiManagerAndroid);
  }

  @Override
  public void onAttached(long nativeMidiManagerAndroid, MidiDeviceAndroid device) {
    N.MEOWUhL5(nativeMidiManagerAndroid, device);
  }

  @Override
  public void onDetached(long nativeMidiManagerAndroid, MidiDeviceAndroid device) {
    N.Md3XPFG5(nativeMidiManagerAndroid, device);
  }

  public static MidiManagerAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.MidiManagerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MidiManagerAndroidJni();
  }
}
