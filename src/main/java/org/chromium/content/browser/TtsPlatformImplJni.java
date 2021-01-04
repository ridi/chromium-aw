package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TtsPlatformImplJni implements TtsPlatformImpl.Natives {
  private static TtsPlatformImpl.Natives testInstance;

  public static final JniStaticTestMocker<TtsPlatformImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.TtsPlatformImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.content.browser.TtsPlatformImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void requestTtsStop(long nativeTtsPlatformImplAndroid, TtsPlatformImpl caller) {
    N.M0BAvNEw(nativeTtsPlatformImplAndroid, caller);
  }

  @Override
  public void voicesChanged(long nativeTtsPlatformImplAndroid, TtsPlatformImpl caller) {
    N.MpJkwIUo(nativeTtsPlatformImplAndroid, caller);
  }

  @Override
  public void onEndEvent(long nativeTtsPlatformImplAndroid, TtsPlatformImpl caller,
      int utteranceId) {
    N.M47GdBO5(nativeTtsPlatformImplAndroid, caller, utteranceId);
  }

  @Override
  public void onStartEvent(long nativeTtsPlatformImplAndroid, TtsPlatformImpl caller,
      int utteranceId) {
    N.M2$X0reE(nativeTtsPlatformImplAndroid, caller, utteranceId);
  }

  @Override
  public void onErrorEvent(long nativeTtsPlatformImplAndroid, TtsPlatformImpl caller,
      int utteranceId) {
    N.M1Kw17GB(nativeTtsPlatformImplAndroid, caller, utteranceId);
  }

  public static TtsPlatformImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.TtsPlatformImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TtsPlatformImplJni();
  }
}
