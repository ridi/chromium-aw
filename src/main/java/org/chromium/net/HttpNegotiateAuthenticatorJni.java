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
class HttpNegotiateAuthenticatorJni implements HttpNegotiateAuthenticator.Natives {
  private static HttpNegotiateAuthenticator.Natives testInstance;

  public static final JniStaticTestMocker<HttpNegotiateAuthenticator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.HttpNegotiateAuthenticator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.HttpNegotiateAuthenticator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setResult(long nativeJavaNegotiateResultWrapper, HttpNegotiateAuthenticator caller,
      int status, String authToken) {
    GEN_JNI.org_chromium_net_HttpNegotiateAuthenticator_setResult(nativeJavaNegotiateResultWrapper, caller, status, authToken);
  }

  public static HttpNegotiateAuthenticator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.HttpNegotiateAuthenticator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new HttpNegotiateAuthenticatorJni();
  }
}
