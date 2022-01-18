package org.chromium.android_webview;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class JsReplyProxyJni implements JsReplyProxy.Natives {
  private static JsReplyProxy.Natives testInstance;

  public static final JniStaticTestMocker<JsReplyProxy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.JsReplyProxy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.JsReplyProxy.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void postMessage(long nativeJsReplyProxy, String message) {
    GEN_JNI.org_chromium_android_1webview_JsReplyProxy_postMessage(nativeJsReplyProxy, message);
  }

  public static JsReplyProxy.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.JsReplyProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JsReplyProxyJni();
  }
}
