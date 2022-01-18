package org.chromium.android_webview.gfx;

import android.graphics.Canvas;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AwPictureJni implements AwPicture.Natives {
  private static AwPicture.Natives testInstance;

  public static final JniStaticTestMocker<AwPicture.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.gfx.AwPicture.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.gfx.AwPicture.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void destroy(long nativeAwPicture) {
    GEN_JNI.org_chromium_android_1webview_gfx_AwPicture_destroy(nativeAwPicture);
  }

  @Override
  public int getWidth(long nativeAwPicture, AwPicture caller) {
    return (int)GEN_JNI.org_chromium_android_1webview_gfx_AwPicture_getWidth(nativeAwPicture, caller);
  }

  @Override
  public int getHeight(long nativeAwPicture, AwPicture caller) {
    return (int)GEN_JNI.org_chromium_android_1webview_gfx_AwPicture_getHeight(nativeAwPicture, caller);
  }

  @Override
  public void draw(long nativeAwPicture, AwPicture caller, Canvas canvas) {
    GEN_JNI.org_chromium_android_1webview_gfx_AwPicture_draw(nativeAwPicture, caller, canvas);
  }

  public static AwPicture.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.gfx.AwPicture.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwPictureJni();
  }
}
