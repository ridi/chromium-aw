package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwTracingControllerJni implements AwTracingController.Natives {
  private static AwTracingController.Natives testInstance;

  public static final JniStaticTestMocker<AwTracingController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwTracingController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwTracingController.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(AwTracingController caller) {
    return (long)N.MJiQrQ3Z(caller);
  }

  @Override
  public boolean start(long nativeAwTracingController, AwTracingController caller,
      String categories, int traceMode) {
    return (boolean)N.MDhATp5G(nativeAwTracingController, caller, categories, traceMode);
  }

  @Override
  public boolean stopAndFlush(long nativeAwTracingController, AwTracingController caller) {
    return (boolean)N.MVnr_0Jw(nativeAwTracingController, caller);
  }

  @Override
  public boolean isTracing(long nativeAwTracingController, AwTracingController caller) {
    return (boolean)N.MI9fwsnY(nativeAwTracingController, caller);
  }

  public static AwTracingController.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwTracingController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwTracingControllerJni();
  }
}
