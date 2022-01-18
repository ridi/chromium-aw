package org.chromium.android_webview;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwSettingsJni implements AwSettings.Natives {
  private static AwSettings.Natives testInstance;

  public static final JniStaticTestMocker<AwSettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwSettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.AwSettings.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(AwSettings caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_android_1webview_AwSettings_init(caller, webContents);
  }

  @Override
  public void destroy(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_destroy(nativeAwSettings, caller);
  }

  @Override
  public void populateWebPreferencesLocked(long nativeAwSettings, AwSettings caller,
      long webPrefsPtr) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_populateWebPreferencesLocked(nativeAwSettings, caller, webPrefsPtr);
  }

  @Override
  public void resetScrollAndScaleState(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_resetScrollAndScaleState(nativeAwSettings, caller);
  }

  @Override
  public void updateEverythingLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateEverythingLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateInitialPageScaleLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateInitialPageScaleLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateUserAgentLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateUserAgentLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateWebkitPreferencesLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateWebkitPreferencesLocked(nativeAwSettings, caller);
  }

  @Override
  public String getDefaultUserAgent() {
    return (String)GEN_JNI.org_chromium_android_1webview_AwSettings_getDefaultUserAgent();
  }

  @Override
  public void updateFormDataPreferencesLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateFormDataPreferencesLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateRendererPreferencesLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateRendererPreferencesLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateOffscreenPreRasterLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateOffscreenPreRasterLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateWillSuppressErrorStateLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateWillSuppressErrorStateLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateCookiePolicyLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateCookiePolicyLocked(nativeAwSettings, caller);
  }

  @Override
  public void updateAllowFileAccessLocked(long nativeAwSettings, AwSettings caller) {
    GEN_JNI.org_chromium_android_1webview_AwSettings_updateAllowFileAccessLocked(nativeAwSettings, caller);
  }

  @Override
  public boolean isDarkMode(long nativeAwSettings, AwSettings caller) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_AwSettings_isDarkMode(nativeAwSettings, caller);
  }

  public static AwSettings.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwSettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwSettingsJni();
  }
}
