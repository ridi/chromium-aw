package org.chromium.content.common;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ServiceManagerConnectionImplJni implements ServiceManagerConnectionImpl.Natives {
  private static ServiceManagerConnectionImpl.Natives testInstance;

  public static final JniStaticTestMocker<ServiceManagerConnectionImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.common.ServiceManagerConnectionImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.common.ServiceManagerConnectionImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getConnectorMessagePipeHandle() {
    return (int)GEN_JNI.org_chromium_content_common_ServiceManagerConnectionImpl_getConnectorMessagePipeHandle();
  }

  public static ServiceManagerConnectionImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.common.ServiceManagerConnectionImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ServiceManagerConnectionImplJni();
  }
}
