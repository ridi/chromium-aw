package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwSettingsJni implements AwSettings.Natives {
  private static AwSettings.Natives testInstance;

  public static final JniStaticTestMocker<AwSettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwSettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwSettings.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(AwSettings caller, WebContents webContents) {
    return (long)N.M4GPw_sx(caller, webContents);
  }

  @Override
  public void destroy(long nativeAwSettings, AwSettings caller) {
    N.MtdU4vpL(nativeAwSettings, caller);
  }

  @Override
  public void populateWebPreferencesLocked(long nativeAwSettings, AwSettings caller,
      long webPrefsPtr) {
    N.MrAp8rc4(nativeAwSettings, caller, webPrefsPtr);
  }

  @Override
  public void resetScrollAndScaleState(long nativeAwSettings, AwSettings caller) {
    N.MYBohkOD(nativeAwSettings, caller);
  }

  @Override
  public void updateEverythingLocked(long nativeAwSettings, AwSettings caller) {
    N.Mq8l4Aae(nativeAwSettings, caller);
  }

  @Override
  public void updateInitialPageScaleLocked(long nativeAwSettings, AwSettings caller) {
    N.ManPyeB5(nativeAwSettings, caller);
  }

  @Override
  public void updateUserAgentLocked(long nativeAwSettings, AwSettings caller) {
    N.MShmU87b(nativeAwSettings, caller);
  }

  @Override
  public void updateWebkitPreferencesLocked(long nativeAwSettings, AwSettings caller) {
    N.MuI9Jt0j(nativeAwSettings, caller);
  }

  @Override
  public String getDefaultUserAgent() {
    return (String)N.MEzAefkM();
  }

  @Override
  public void updateFormDataPreferencesLocked(long nativeAwSettings, AwSettings caller) {
    N.Mt45ai_h(nativeAwSettings, caller);
  }

  @Override
  public void updateRendererPreferencesLocked(long nativeAwSettings, AwSettings caller) {
    N.MbLkcpTV(nativeAwSettings, caller);
  }

  @Override
  public void updateOffscreenPreRasterLocked(long nativeAwSettings, AwSettings caller) {
    N.ML5KB9Yq(nativeAwSettings, caller);
  }

  @Override
  public void updateWillSuppressErrorStateLocked(long nativeAwSettings, AwSettings caller) {
    N.MVXG782O(nativeAwSettings, caller);
  }

  @Override
  public void updateCookiePolicyLocked(long nativeAwSettings, AwSettings caller) {
    N.M2EmJ2$z(nativeAwSettings, caller);
  }

  @Override
  public void updateAllowFileAccessLocked(long nativeAwSettings, AwSettings caller) {
    N.M_GO18v7(nativeAwSettings, caller);
  }

  public static AwSettings.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwSettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwSettingsJni();
  }
}
