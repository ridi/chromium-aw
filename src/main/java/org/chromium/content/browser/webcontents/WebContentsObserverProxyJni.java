package org.chromium.content.browser.webcontents;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class WebContentsObserverProxyJni implements WebContentsObserverProxy.Natives {
  private static WebContentsObserverProxy.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsObserverProxy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContentsObserverProxy caller, WebContentsImpl webContents) {
    return (long)GEN_JNI.org_chromium_content_browser_webcontents_WebContentsObserverProxy_init(caller, webContents);
  }

  @Override
  public void destroy(long nativeWebContentsObserverProxy, WebContentsObserverProxy caller) {
    GEN_JNI.org_chromium_content_browser_webcontents_WebContentsObserverProxy_destroy(nativeWebContentsObserverProxy, caller);
  }

  public static WebContentsObserverProxy.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsObserverProxyJni();
  }
}
