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
final class AwPacProcessorJni implements AwPacProcessor.Natives {
  private static AwPacProcessor.Natives testInstance;

  public static final JniStaticTestMocker<AwPacProcessor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwPacProcessor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwPacProcessor.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getDefaultPacProcessor() {
    return (long)N.Mf2TcTCl();
  }

  @Override
  public boolean setProxyScript(long nativeAwPacProcessor, AwPacProcessor caller, String script) {
    return (boolean)N.MEjwJwuS(nativeAwPacProcessor, caller, script);
  }

  @Override
  public String makeProxyRequest(long nativeAwPacProcessor, AwPacProcessor caller, String url) {
    return (String)N.ME9i0MKK(nativeAwPacProcessor, caller, url);
  }

  public static AwPacProcessor.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwPacProcessor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwPacProcessorJni();
  }
}
