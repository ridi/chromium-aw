package org.chromium.components.content_capture;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class OnscreenContentProviderJni implements OnscreenContentProvider.Natives {
  private static OnscreenContentProvider.Natives testInstance;

  public static final JniStaticTestMocker<OnscreenContentProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_capture.OnscreenContentProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_capture.OnscreenContentProvider.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OnscreenContentProvider caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_content_1capture_OnscreenContentProvider_init(caller, webContents);
  }

  @Override
  public void onWebContentsChanged(long nativeOnscreenContentProviderAndroid,
      WebContents webContents) {
    GEN_JNI.org_chromium_components_content_1capture_OnscreenContentProvider_onWebContentsChanged(nativeOnscreenContentProviderAndroid, webContents);
  }

  @Override
  public void destroy(long nativeOnscreenContentProviderAndroid) {
    GEN_JNI.org_chromium_components_content_1capture_OnscreenContentProvider_destroy(nativeOnscreenContentProviderAndroid);
  }

  public static OnscreenContentProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_capture.OnscreenContentProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OnscreenContentProviderJni();
  }
}
