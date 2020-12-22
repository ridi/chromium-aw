package org.chromium.content.browser.accessibility.captioning;

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
final class CaptioningControllerJni implements CaptioningController.Natives {
  private static CaptioningController.Natives testInstance;

  public static final JniStaticTestMocker<CaptioningController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.accessibility.captioning.CaptioningController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.accessibility.captioning.CaptioningController.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CaptioningController caller, WebContents webContents) {
    return (long)N.MX95jWaj(caller, webContents);
  }

  @Override
  public void setTextTrackSettings(long nativeCaptioningController, CaptioningController caller,
      boolean textTracksEnabled, String textTrackBackgroundColor, String textTrackFontFamily,
      String textTrackFontStyle, String textTrackFontVariant, String textTrackTextColor,
      String textTrackTextShadow, String textTrackTextSize) {
    N.MM3_AH7F(nativeCaptioningController, caller, textTracksEnabled, textTrackBackgroundColor, textTrackFontFamily, textTrackFontStyle, textTrackFontVariant, textTrackTextColor, textTrackTextShadow, textTrackTextSize);
  }

  public static CaptioningController.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.accessibility.captioning.CaptioningController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CaptioningControllerJni();
  }
}
