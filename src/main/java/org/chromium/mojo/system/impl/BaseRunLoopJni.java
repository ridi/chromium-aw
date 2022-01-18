package org.chromium.mojo.system.impl;

import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class BaseRunLoopJni implements BaseRunLoop.Natives {
  private static BaseRunLoop.Natives testInstance;

  public static final JniStaticTestMocker<BaseRunLoop.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.mojo.system.impl.BaseRunLoop.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.mojo.system.impl.BaseRunLoop.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createBaseRunLoop(BaseRunLoop caller) {
    return (long)GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_createBaseRunLoop(caller);
  }

  @Override
  public void run(BaseRunLoop caller) {
    GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_run(caller);
  }

  @Override
  public void runUntilIdle(BaseRunLoop caller) {
    GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_runUntilIdle(caller);
  }

  @Override
  public void quit(BaseRunLoop caller) {
    GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_quit(caller);
  }

  @Override
  public void postDelayedTask(BaseRunLoop caller, long runLoopID, Runnable runnable, long delay) {
    GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_postDelayedTask(caller, runLoopID, runnable, delay);
  }

  @Override
  public void deleteMessageLoop(BaseRunLoop caller, long runLoopID) {
    GEN_JNI.org_chromium_mojo_system_impl_BaseRunLoop_deleteMessageLoop(caller, runLoopID);
  }

  public static BaseRunLoop.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.BaseRunLoop.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BaseRunLoopJni();
  }
}
