package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class MediaSessionImplJni implements MediaSessionImpl.Natives {
  private static MediaSessionImpl.Natives testInstance;

  public static final JniStaticTestMocker<MediaSessionImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.MediaSessionImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.MediaSessionImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void resume(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    GEN_JNI.org_chromium_content_browser_MediaSessionImpl_resume(nativeMediaSessionAndroid, caller);
  }

  @Override
  public void suspend(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    GEN_JNI.org_chromium_content_browser_MediaSessionImpl_suspend(nativeMediaSessionAndroid, caller);
  }

  @Override
  public void stop(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    GEN_JNI.org_chromium_content_browser_MediaSessionImpl_stop(nativeMediaSessionAndroid, caller);
  }

  @Override
  public void seek(long nativeMediaSessionAndroid, MediaSessionImpl caller, long millis) {
    GEN_JNI.org_chromium_content_browser_MediaSessionImpl_seek(nativeMediaSessionAndroid, caller, millis);
  }

  @Override
  public void seekTo(long nativeMediaSessionAndroid, MediaSessionImpl caller, long millis) {
    GEN_JNI.org_chromium_content_browser_MediaSessionImpl_seekTo(nativeMediaSessionAndroid, caller, millis);
  }

  @Override
  public void didReceiveAction(long nativeMediaSessionAndroid, MediaSessionImpl caller,
      int action) {
    GEN_JNI.org_chromium_content_browser_MediaSessionImpl_didReceiveAction(nativeMediaSessionAndroid, caller, action);
  }

  @Override
  public void requestSystemAudioFocus(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    GEN_JNI.org_chromium_content_browser_MediaSessionImpl_requestSystemAudioFocus(nativeMediaSessionAndroid, caller);
  }

  @Override
  public MediaSessionImpl getMediaSessionFromWebContents(WebContents contents) {
    return (MediaSessionImpl)GEN_JNI.org_chromium_content_browser_MediaSessionImpl_getMediaSessionFromWebContents(contents);
  }

  public static MediaSessionImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.MediaSessionImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaSessionImplJni();
  }
}
