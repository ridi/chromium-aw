package org.chromium.content_public.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class NavigationHandleJni implements NavigationHandle.Natives {
  private static NavigationHandle.Natives testInstance;

  public static final JniStaticTestMocker<NavigationHandle.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content_public.browser.NavigationHandle.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content_public.browser.NavigationHandle.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setRequestHeader(long nativeNavigationHandleProxy, String headerName,
      String headerValue) {
    GEN_JNI.org_chromium_content_1public_browser_NavigationHandle_setRequestHeader(nativeNavigationHandleProxy, headerName, headerValue);
  }

  @Override
  public void removeRequestHeader(long nativeNavigationHandleProxy, String headerName) {
    GEN_JNI.org_chromium_content_1public_browser_NavigationHandle_removeRequestHeader(nativeNavigationHandleProxy, headerName);
  }

  public static NavigationHandle.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.browser.NavigationHandle.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NavigationHandleJni();
  }
}
