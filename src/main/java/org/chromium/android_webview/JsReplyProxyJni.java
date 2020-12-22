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
final class JsReplyProxyJni implements JsReplyProxy.Natives {
  private static JsReplyProxy.Natives testInstance;

  public static final JniStaticTestMocker<JsReplyProxy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.JsReplyProxy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.JsReplyProxy.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void postMessage(long nativeJsReplyProxy, String message) {
    N.MayS5i9E(nativeJsReplyProxy, message);
  }

  public static JsReplyProxy.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.JsReplyProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JsReplyProxyJni();
  }
}
