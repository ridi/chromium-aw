package org.chromium.base.metrics;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class NativeUmaRecorderJni implements NativeUmaRecorder.Natives {
  private static NativeUmaRecorder.Natives testInstance;

  public static final JniStaticTestMocker<NativeUmaRecorder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.metrics.NativeUmaRecorder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.metrics.NativeUmaRecorder.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long recordBooleanHistogram(String name, long nativeHint, boolean sample) {
    return (long)N.MtKTTHie(name, nativeHint, sample);
  }

  @Override
  public long recordExponentialHistogram(String name, long nativeHint, int sample, int min, int max,
      int numBuckets) {
    return (long)N.MILRV9Ch(name, nativeHint, sample, min, max, numBuckets);
  }

  @Override
  public long recordLinearHistogram(String name, long nativeHint, int sample, int min, int max,
      int numBuckets) {
    return (long)N.M$oMD214(name, nativeHint, sample, min, max, numBuckets);
  }

  @Override
  public long recordSparseHistogram(String name, long nativeHint, int sample) {
    return (long)N.Mk1ai9mx(name, nativeHint, sample);
  }

  public static NativeUmaRecorder.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.NativeUmaRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new NativeUmaRecorderJni();
  }
}
