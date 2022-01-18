package org.chromium.net;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class HttpUtilJni implements HttpUtil.Natives {
  private static HttpUtil.Natives testInstance;

  public static final JniStaticTestMocker<HttpUtil.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.HttpUtil.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.HttpUtil.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isAllowedHeader(String headerName, String headerValue) {
    return (boolean)GEN_JNI.org_chromium_net_HttpUtil_isAllowedHeader(headerName, headerValue);
  }

  public static HttpUtil.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.HttpUtil.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new HttpUtilJni();
  }
}
