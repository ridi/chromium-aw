package org.chromium.content.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AppWebMessagePortJni implements AppWebMessagePort.Natives {
  private static AppWebMessagePort.Natives testInstance;

  public static final JniStaticTestMocker<AppWebMessagePort.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.AppWebMessagePort.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.AppWebMessagePort.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String decodeStringMessage(byte[] encodedData) {
    return (String)GEN_JNI.org_chromium_content_browser_AppWebMessagePort_decodeStringMessage(encodedData);
  }

  @Override
  public byte[] encodeStringMessage(String message) {
    return (byte[])GEN_JNI.org_chromium_content_browser_AppWebMessagePort_encodeStringMessage(message);
  }

  public static AppWebMessagePort.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AppWebMessagePort.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AppWebMessagePortJni();
  }
}
