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
class AwCookieManagerJni implements AwCookieManager.Natives {
  private static AwCookieManager.Natives testInstance;

  public static final JniStaticTestMocker<AwCookieManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwCookieManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwCookieManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getDefaultCookieManager() {
    return (long)GEN_JNI.org_chromium_android_1webview_AwCookieManager_getDefaultCookieManager();
  }

  @Override
  public void setShouldAcceptCookies(long nativeCookieManager, AwCookieManager caller,
      boolean accept) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_setShouldAcceptCookies(nativeCookieManager, caller, accept);
  }

  @Override
  public boolean getShouldAcceptCookies(long nativeCookieManager, AwCookieManager caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwCookieManager_getShouldAcceptCookies(nativeCookieManager, caller);
  }

  @Override
  public void setCookie(long nativeCookieManager, AwCookieManager caller, String url, String value,
      AwCookieManager.CookieCallback callback) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_setCookie(nativeCookieManager, caller, url, value, callback);
  }

  @Override
  public void setCookieSync(long nativeCookieManager, AwCookieManager caller, String url,
      String value) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_setCookieSync(nativeCookieManager, caller, url, value);
  }

  @Override
  public String getCookie(long nativeCookieManager, AwCookieManager caller, String url) {
    return (String)GEN_JNI.org_chromium_android_1webview_AwCookieManager_getCookie(nativeCookieManager, caller, url);
  }

  @Override
  public void removeSessionCookies(long nativeCookieManager, AwCookieManager caller,
      AwCookieManager.CookieCallback callback) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_removeSessionCookies(nativeCookieManager, caller, callback);
  }

  @Override
  public void removeSessionCookiesSync(long nativeCookieManager, AwCookieManager caller) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_removeSessionCookiesSync(nativeCookieManager, caller);
  }

  @Override
  public void removeAllCookies(long nativeCookieManager, AwCookieManager caller,
      AwCookieManager.CookieCallback callback) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_removeAllCookies(nativeCookieManager, caller, callback);
  }

  @Override
  public void removeAllCookiesSync(long nativeCookieManager, AwCookieManager caller) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_removeAllCookiesSync(nativeCookieManager, caller);
  }

  @Override
  public void removeExpiredCookies(long nativeCookieManager, AwCookieManager caller) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_removeExpiredCookies(nativeCookieManager, caller);
  }

  @Override
  public void flushCookieStore(long nativeCookieManager, AwCookieManager caller) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_flushCookieStore(nativeCookieManager, caller);
  }

  @Override
  public boolean hasCookies(long nativeCookieManager, AwCookieManager caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwCookieManager_hasCookies(nativeCookieManager, caller);
  }

  @Override
  public boolean getAllowFileSchemeCookies(long nativeCookieManager, AwCookieManager caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwCookieManager_getAllowFileSchemeCookies(nativeCookieManager, caller);
  }

  @Override
  public void setAllowFileSchemeCookies(long nativeCookieManager, AwCookieManager caller,
      boolean allow) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_setAllowFileSchemeCookies(nativeCookieManager, caller, allow);
  }

  @Override
  public void setWorkaroundHttpSecureCookiesForTesting(long nativeCookieManager,
      AwCookieManager caller, boolean allow) {
    GEN_JNI.org_chromium_android_1webview_AwCookieManager_setWorkaroundHttpSecureCookiesForTesting(nativeCookieManager, caller, allow);
  }

  public static AwCookieManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwCookieManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwCookieManagerJni();
  }
}
