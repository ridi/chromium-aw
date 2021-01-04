package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwDevToolsServerJni implements AwDevToolsServer.Natives {
  private static AwDevToolsServer.Natives testInstance;

  public static final JniStaticTestMocker<AwDevToolsServer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwDevToolsServer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwDevToolsServer.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initRemoteDebugging(AwDevToolsServer caller) {
    return (long)N.MavwYLrk(caller);
  }

  @Override
  public void destroyRemoteDebugging(AwDevToolsServer caller, long devToolsServer) {
    N.MQr9muLU(caller, devToolsServer);
  }

  @Override
  public void setRemoteDebuggingEnabled(AwDevToolsServer caller, long devToolsServer,
      boolean enabled) {
    N.MQE$FZ2u(caller, devToolsServer, enabled);
  }

  public static AwDevToolsServer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwDevToolsServer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwDevToolsServerJni();
  }
}
