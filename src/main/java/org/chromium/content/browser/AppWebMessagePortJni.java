package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AppWebMessagePortJni implements AppWebMessagePort.Natives {
  private static AppWebMessagePort.Natives testInstance;

  public static final JniStaticTestMocker<AppWebMessagePort.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.AppWebMessagePort.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.AppWebMessagePort.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String decodeStringMessage(byte[] encodedData) {
    return (String)N.MWL_OG7s(encodedData);
  }

  @Override
  public byte[] encodeStringMessage(String message) {
    return (byte[])N.Mk6SEKCp(message);
  }

  public static AppWebMessagePort.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AppWebMessagePort.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AppWebMessagePortJni();
  }
}
