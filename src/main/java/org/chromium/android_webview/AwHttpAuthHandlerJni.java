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
class AwHttpAuthHandlerJni implements AwHttpAuthHandler.Natives {
  private static AwHttpAuthHandler.Natives testInstance;

  public static final JniStaticTestMocker<AwHttpAuthHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwHttpAuthHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwHttpAuthHandler.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void proceed(long nativeAwHttpAuthHandler, AwHttpAuthHandler caller, String username,
      String password) {
    GEN_JNI.org_chromium_android_1webview_AwHttpAuthHandler_proceed(nativeAwHttpAuthHandler, caller, username, password);
  }

  @Override
  public void cancel(long nativeAwHttpAuthHandler, AwHttpAuthHandler caller) {
    GEN_JNI.org_chromium_android_1webview_AwHttpAuthHandler_cancel(nativeAwHttpAuthHandler, caller);
  }

  public static AwHttpAuthHandler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwHttpAuthHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwHttpAuthHandlerJni();
  }
}
