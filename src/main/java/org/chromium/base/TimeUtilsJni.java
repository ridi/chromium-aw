package org.chromium.base;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
public final class TimeUtilsJni implements TimeUtils.Natives {
  private static TimeUtils.Natives testInstance;

  public static final JniStaticTestMocker<TimeUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.TimeUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.TimeUtils.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getTimeTicksNowUs() {
    return (long)N.MklbOJun();
  }

  public static TimeUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.TimeUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new TimeUtilsJni();
  }
}
