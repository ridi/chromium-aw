package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwCookieManagerJni implements AwCookieManager.Natives {
  private static AwCookieManager.Natives testInstance;

  public static final JniStaticTestMocker<AwCookieManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwCookieManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwCookieManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getDefaultCookieManager() {
    return (long)N.M2x3bkF7();
  }

  @Override
  public void setShouldAcceptCookies(long nativeCookieManager, AwCookieManager caller,
      boolean accept) {
    N.MxGz1CMI(nativeCookieManager, caller, accept);
  }

  @Override
  public boolean getShouldAcceptCookies(long nativeCookieManager, AwCookieManager caller) {
    return (boolean)N.MIaWBQxt(nativeCookieManager, caller);
  }

  @Override
  public void setCookie(long nativeCookieManager, AwCookieManager caller, String url, String value,
      AwCookieManager.CookieCallback callback) {
    N.MqWxZVFj(nativeCookieManager, caller, url, value, callback);
  }

  @Override
  public void setCookieSync(long nativeCookieManager, AwCookieManager caller, String url,
      String value) {
    N.M521ruQI(nativeCookieManager, caller, url, value);
  }

  @Override
  public String getCookie(long nativeCookieManager, AwCookieManager caller, String url) {
    return (String)N.MwtyXc6D(nativeCookieManager, caller, url);
  }

  @Override
  public void removeSessionCookies(long nativeCookieManager, AwCookieManager caller,
      AwCookieManager.CookieCallback callback) {
    N.MPH4p3lP(nativeCookieManager, caller, callback);
  }

  @Override
  public void removeSessionCookiesSync(long nativeCookieManager, AwCookieManager caller) {
    N.MCvO0Hcd(nativeCookieManager, caller);
  }

  @Override
  public void removeAllCookies(long nativeCookieManager, AwCookieManager caller,
      AwCookieManager.CookieCallback callback) {
    N.MYNMnyIh(nativeCookieManager, caller, callback);
  }

  @Override
  public void removeAllCookiesSync(long nativeCookieManager, AwCookieManager caller) {
    N.M8tXWfBc(nativeCookieManager, caller);
  }

  @Override
  public void removeExpiredCookies(long nativeCookieManager, AwCookieManager caller) {
    N.MtpZW_Jk(nativeCookieManager, caller);
  }

  @Override
  public void flushCookieStore(long nativeCookieManager, AwCookieManager caller) {
    N.MgWRfeHz(nativeCookieManager, caller);
  }

  @Override
  public boolean hasCookies(long nativeCookieManager, AwCookieManager caller) {
    return (boolean)N.MLEl9vQp(nativeCookieManager, caller);
  }

  @Override
  public boolean getAllowFileSchemeCookies(long nativeCookieManager, AwCookieManager caller) {
    return (boolean)N.MjZje8ZY(nativeCookieManager, caller);
  }

  @Override
  public void setAllowFileSchemeCookies(long nativeCookieManager, AwCookieManager caller,
      boolean allow) {
    N.Mfo4YHeg(nativeCookieManager, caller, allow);
  }

  public static AwCookieManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwCookieManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwCookieManagerJni();
  }
}
