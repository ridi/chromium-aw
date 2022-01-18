package org.chromium.base.metrics;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class NativeUmaRecorderJni implements NativeUmaRecorder.Natives {
  private static NativeUmaRecorder.Natives testInstance;

  public static final JniStaticTestMocker<NativeUmaRecorder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.metrics.NativeUmaRecorder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.metrics.NativeUmaRecorder.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long recordBooleanHistogram(String name, long nativeHint, boolean sample) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordBooleanHistogram(name, nativeHint, sample);
  }

  @Override
  public long recordExponentialHistogram(String name, long nativeHint, int sample, int min, int max,
      int numBuckets) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordExponentialHistogram(name, nativeHint, sample, min, max, numBuckets);
  }

  @Override
  public long recordLinearHistogram(String name, long nativeHint, int sample, int min, int max,
      int numBuckets) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordLinearHistogram(name, nativeHint, sample, min, max, numBuckets);
  }

  @Override
  public long recordSparseHistogram(String name, long nativeHint, int sample) {
    return (long)GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordSparseHistogram(name, nativeHint, sample);
  }

  @Override
  public void recordUserAction(String name, long millisSinceEvent) {
    GEN_JNI.org_chromium_base_metrics_NativeUmaRecorder_recordUserAction(name, millisSinceEvent);
  }

  public static NativeUmaRecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.NativeUmaRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new NativeUmaRecorderJni();
  }
}
