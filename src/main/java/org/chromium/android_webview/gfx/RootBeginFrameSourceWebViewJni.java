package org.chromium.android_webview.gfx;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RootBeginFrameSourceWebViewJni implements RootBeginFrameSourceWebView.Natives {
  private static RootBeginFrameSourceWebView.Natives testInstance;

  public static final JniStaticTestMocker<RootBeginFrameSourceWebView.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.gfx.RootBeginFrameSourceWebView.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.gfx.RootBeginFrameSourceWebView.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onUpdateRefreshRate(long nativeRootBeginFrameSourceWebView,
      RootBeginFrameSourceWebView caller, float refreshRate) {
    N.MsBIPWH$(nativeRootBeginFrameSourceWebView, caller, refreshRate);
  }

  public static RootBeginFrameSourceWebView.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.gfx.RootBeginFrameSourceWebView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RootBeginFrameSourceWebViewJni();
  }
}
