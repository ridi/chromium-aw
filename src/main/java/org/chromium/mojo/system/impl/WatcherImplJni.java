package org.chromium.mojo.system.impl;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WatcherImplJni implements WatcherImpl.Natives {
  private static WatcherImpl.Natives testInstance;

  public static final JniStaticTestMocker<WatcherImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.mojo.system.impl.WatcherImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.mojo.system.impl.WatcherImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createWatcher(WatcherImpl caller) {
    return (long)N.MXGgOw9k(caller);
  }

  @Override
  public int start(WatcherImpl caller, long implPtr, int mojoHandle, int flags) {
    return (int)N.MOmBVeTt(caller, implPtr, mojoHandle, flags);
  }

  @Override
  public void cancel(WatcherImpl caller, long implPtr) {
    N.MPTT407x(caller, implPtr);
  }

  @Override
  public void delete(WatcherImpl caller, long implPtr) {
    N.Mi32vqDA(caller, implPtr);
  }

  public static WatcherImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.mojo.system.impl.WatcherImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WatcherImplJni();
  }
}
