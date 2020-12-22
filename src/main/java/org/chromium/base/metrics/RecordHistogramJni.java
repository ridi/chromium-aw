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
public final class RecordHistogramJni implements RecordHistogram.Natives {
  private static RecordHistogram.Natives testInstance;

  public static final JniStaticTestMocker<RecordHistogram.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.metrics.RecordHistogram.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.metrics.RecordHistogram.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getHistogramValueCountForTesting(String name, int sample) {
    return (int)N.M1gJHszj(name, sample);
  }

  @Override
  public int getHistogramTotalCountForTesting(String name) {
    return (int)N.M4mrObfZ(name);
  }

  public static RecordHistogram.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.RecordHistogram.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new RecordHistogramJni();
  }
}
