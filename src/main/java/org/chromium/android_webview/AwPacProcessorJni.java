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
class AwPacProcessorJni implements AwPacProcessor.Natives {
  private static AwPacProcessor.Natives testInstance;

  public static final JniStaticTestMocker<AwPacProcessor.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwPacProcessor.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwPacProcessor.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initializeEnvironment() {
    GEN_JNI.org_chromium_android_1webview_AwPacProcessor_initializeEnvironment();
  }

  @Override
  public long createNativePacProcessor() {
    return (long)GEN_JNI.org_chromium_android_1webview_AwPacProcessor_createNativePacProcessor();
  }

  @Override
  public boolean setProxyScript(long nativeAwPacProcessor, AwPacProcessor caller, String script) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwPacProcessor_setProxyScript(nativeAwPacProcessor, caller, script);
  }

  @Override
  public String makeProxyRequest(long nativeAwPacProcessor, AwPacProcessor caller, String url) {
    return (String)GEN_JNI.org_chromium_android_1webview_AwPacProcessor_makeProxyRequest(nativeAwPacProcessor, caller, url);
  }

  @Override
  public void destroyNative(long nativeAwPacProcessor, AwPacProcessor caller) {
    GEN_JNI.org_chromium_android_1webview_AwPacProcessor_destroyNative(nativeAwPacProcessor, caller);
  }

  @Override
  public void setNetworkAndLinkAddresses(long nativeAwPacProcessor, long networkHandle,
      String[] adresses) {
    GEN_JNI.org_chromium_android_1webview_AwPacProcessor_setNetworkAndLinkAddresses(nativeAwPacProcessor, networkHandle, adresses);
  }

  public static AwPacProcessor.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwPacProcessor.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwPacProcessorJni();
  }
}
