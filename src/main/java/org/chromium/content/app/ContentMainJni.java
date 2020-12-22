package org.chromium.content.app;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class ContentMainJni implements ContentMain.Natives {
  private static ContentMain.Natives testInstance;

  public static final JniStaticTestMocker<ContentMain.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.app.ContentMain.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.content.app.ContentMain.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int start(boolean startServiceManagerOnly) {
    return (int)N.M1Y_XVCN(startServiceManagerOnly);
  }

  public static ContentMain.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.app.ContentMain.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ContentMainJni();
  }
}
