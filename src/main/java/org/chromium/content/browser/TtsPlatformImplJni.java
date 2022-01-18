package org.chromium.content.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class TtsPlatformImplJni implements TtsPlatformImpl.Natives {
  private static TtsPlatformImpl.Natives testInstance;

  public static final JniStaticTestMocker<TtsPlatformImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.TtsPlatformImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.content.browser.TtsPlatformImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void voicesChanged(long nativeTtsPlatformImplAndroid) {
    GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_voicesChanged(nativeTtsPlatformImplAndroid);
  }

  @Override
  public void onEndEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
    GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_onEndEvent(nativeTtsPlatformImplAndroid, utteranceId);
  }

  @Override
  public void onStartEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
    GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_onStartEvent(nativeTtsPlatformImplAndroid, utteranceId);
  }

  @Override
  public void onErrorEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
    GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_onErrorEvent(nativeTtsPlatformImplAndroid, utteranceId);
  }

  public static TtsPlatformImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.TtsPlatformImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TtsPlatformImplJni();
  }
}
