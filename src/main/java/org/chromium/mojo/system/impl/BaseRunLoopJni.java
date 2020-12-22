package org.chromium.mojo.system.impl;

import J.N;
import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BaseRunLoopJni implements BaseRunLoop.Natives {
  private static BaseRunLoop.Natives testInstance;

  public static final JniStaticTestMocker<BaseRunLoop.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.mojo.system.impl.BaseRunLoop.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.mojo.system.impl.BaseRunLoop.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createBaseRunLoop(BaseRunLoop caller) {
    return (long)N.MOJ55i7J(caller);
  }

  @Override
  public void run(BaseRunLoop caller) {
    N.MWXT8JHC(caller);
  }

  @Override
  public void runUntilIdle(BaseRunLoop caller) {
    N.MeWGVAnX(caller);
  }

  @Override
  public void quit(BaseRunLoop caller) {
    N.MvPYY0Pk(caller);
  }

  @Override
  public void postDelayedTask(BaseRunLoop caller, long runLoopID, Runnable runnable, long delay) {
    N.Mg$AGbqU(caller, runLoopID, runnable, delay);
  }

  @Override
  public void deleteMessageLoop(BaseRunLoop caller, long runLoopID) {
    N.MEexSuCr(caller, runLoopID);
  }

  public static BaseRunLoop.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.BaseRunLoop.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BaseRunLoopJni();
  }
}
