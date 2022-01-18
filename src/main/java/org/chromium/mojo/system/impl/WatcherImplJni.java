package org.chromium.mojo.system.impl;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class WatcherImplJni implements WatcherImpl.Natives {
  private static WatcherImpl.Natives testInstance;

  public static final JniStaticTestMocker<WatcherImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.mojo.system.impl.WatcherImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.mojo.system.impl.WatcherImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createWatcher(WatcherImpl caller) {
    return (long)GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_createWatcher(caller);
  }

  @Override
  public int start(WatcherImpl caller, long implPtr, int mojoHandle, int flags) {
    return (int)GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_start(caller, implPtr, mojoHandle, flags);
  }

  @Override
  public void cancel(WatcherImpl caller, long implPtr) {
    GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_cancel(caller, implPtr);
  }

  @Override
  public void delete(WatcherImpl caller, long implPtr) {
    GEN_JNI.org_chromium_mojo_system_impl_WatcherImpl_delete(caller, implPtr);
  }

  public static WatcherImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.WatcherImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new WatcherImplJni();
  }
}
