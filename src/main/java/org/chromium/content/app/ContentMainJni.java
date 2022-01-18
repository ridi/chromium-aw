package org.chromium.content.app;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class ContentMainJni implements ContentMain.Natives {
  private static ContentMain.Natives testInstance;

  public static final JniStaticTestMocker<ContentMain.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.app.ContentMain.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.content.app.ContentMain.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int start(boolean startMinimalBrowser) {
    return (int)GEN_JNI.org_chromium_content_app_ContentMain_start(startMinimalBrowser);
  }

  public static ContentMain.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.app.ContentMain.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ContentMainJni();
  }
}
