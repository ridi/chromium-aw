package org.chromium.content_public.common;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ResourceRequestBodyJni implements ResourceRequestBody.Natives {
  private static ResourceRequestBody.Natives testInstance;

  public static final JniStaticTestMocker<ResourceRequestBody.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content_public.common.ResourceRequestBody.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content_public.common.ResourceRequestBody.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public byte[] createResourceRequestBodyFromBytes(byte[] httpBody) {
    return (byte[])N.MugoAW_d(httpBody);
  }

  public static ResourceRequestBody.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.common.ResourceRequestBody.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ResourceRequestBodyJni();
  }
}
