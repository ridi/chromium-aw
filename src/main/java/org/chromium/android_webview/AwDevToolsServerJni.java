package org.chromium.android_webview;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwDevToolsServerJni implements AwDevToolsServer.Natives {
  private static AwDevToolsServer.Natives testInstance;

  public static final JniStaticTestMocker<AwDevToolsServer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwDevToolsServer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwDevToolsServer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initRemoteDebugging(AwDevToolsServer caller) {
    return (long)GEN_JNI.org_chromium_android_1webview_AwDevToolsServer_initRemoteDebugging(caller);
  }

  @Override
  public void destroyRemoteDebugging(AwDevToolsServer caller, long devToolsServer) {
    GEN_JNI.org_chromium_android_1webview_AwDevToolsServer_destroyRemoteDebugging(caller, devToolsServer);
  }

  @Override
  public void setRemoteDebuggingEnabled(AwDevToolsServer caller, long devToolsServer,
      boolean enabled) {
    GEN_JNI.org_chromium_android_1webview_AwDevToolsServer_setRemoteDebuggingEnabled(caller, devToolsServer, enabled);
  }

  public static AwDevToolsServer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwDevToolsServer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwDevToolsServerJni();
  }
}
