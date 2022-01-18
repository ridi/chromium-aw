package org.chromium.content.browser;

import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public class ClientDataJsonImplJni implements ClientDataJsonImpl.Natives {
  private static ClientDataJsonImpl.Natives testInstance;

  public static final JniStaticTestMocker<ClientDataJsonImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ClientDataJsonImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ClientDataJsonImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String buildClientDataJson(int clientDataRequestType, String callerOrigin,
      byte[] challenge, boolean isCrossOrigin, ByteBuffer optionsByteBuffer, String relyingPartyId,
      String topOrigin) {
    return (String)GEN_JNI.org_chromium_content_browser_ClientDataJsonImpl_buildClientDataJson(clientDataRequestType, callerOrigin, challenge, isCrossOrigin, optionsByteBuffer, relyingPartyId, topOrigin);
  }

  public static ClientDataJsonImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ClientDataJsonImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ClientDataJsonImplJni();
  }
}
