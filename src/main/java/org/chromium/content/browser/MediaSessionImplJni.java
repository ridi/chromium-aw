package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MediaSessionImplJni implements MediaSessionImpl.Natives {
  private static MediaSessionImpl.Natives testInstance;

  public static final JniStaticTestMocker<MediaSessionImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.MediaSessionImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.MediaSessionImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void resume(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    N.MlezJYnz(nativeMediaSessionAndroid, caller);
  }

  @Override
  public void suspend(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    N.M5LC9gX$(nativeMediaSessionAndroid, caller);
  }

  @Override
  public void stop(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    N.MW5s36cs(nativeMediaSessionAndroid, caller);
  }

  @Override
  public void seek(long nativeMediaSessionAndroid, MediaSessionImpl caller, long millis) {
    N.My_T5ZML(nativeMediaSessionAndroid, caller, millis);
  }

  @Override
  public void seekTo(long nativeMediaSessionAndroid, MediaSessionImpl caller, long millis) {
    N.MK7btVfc(nativeMediaSessionAndroid, caller, millis);
  }

  @Override
  public void didReceiveAction(long nativeMediaSessionAndroid, MediaSessionImpl caller,
      int action) {
    N.MAqRqyJa(nativeMediaSessionAndroid, caller, action);
  }

  @Override
  public void requestSystemAudioFocus(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
    N.MdnoDrDw(nativeMediaSessionAndroid, caller);
  }

  @Override
  public MediaSessionImpl getMediaSessionFromWebContents(WebContents contents) {
    return (MediaSessionImpl)N.Mtun$qW8(contents);
  }

  public static MediaSessionImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.MediaSessionImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaSessionImplJni();
  }
}
