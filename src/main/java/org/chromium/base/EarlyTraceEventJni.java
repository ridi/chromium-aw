package org.chromium.base;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class EarlyTraceEventJni implements EarlyTraceEvent.Natives {
  private static EarlyTraceEvent.Natives testInstance;

  public static final JniStaticTestMocker<EarlyTraceEvent.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.EarlyTraceEvent.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.EarlyTraceEvent.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordEarlyEvent(String name, long beginTimNanos, long endTimeNanos, int threadId,
      long threadDurationMillis) {
    N.MDy_VEWN(name, beginTimNanos, endTimeNanos, threadId, threadDurationMillis);
  }

  @Override
  public void recordEarlyStartAsyncEvent(String name, long id, long timestamp) {
    N.M8HhsiE6(name, id, timestamp);
  }

  @Override
  public void recordEarlyFinishAsyncEvent(String name, long id, long timestamp) {
    N.MCm4GHjn(name, id, timestamp);
  }

  public static EarlyTraceEvent.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.EarlyTraceEvent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new EarlyTraceEventJni();
  }
}
