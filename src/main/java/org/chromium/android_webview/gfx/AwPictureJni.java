package org.chromium.android_webview.gfx;

import J.N;
import android.graphics.Canvas;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwPictureJni implements AwPicture.Natives {
  private static AwPicture.Natives testInstance;

  public static final JniStaticTestMocker<AwPicture.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.gfx.AwPicture.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.android_webview.gfx.AwPicture.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void destroy(long nativeAwPicture) {
    N.Mt$FsvYN(nativeAwPicture);
  }

  @Override
  public int getWidth(long nativeAwPicture, AwPicture caller) {
    return (int)N.MxvjfQIM(nativeAwPicture, caller);
  }

  @Override
  public int getHeight(long nativeAwPicture, AwPicture caller) {
    return (int)N.MAAuagRx(nativeAwPicture, caller);
  }

  @Override
  public void draw(long nativeAwPicture, AwPicture caller, Canvas canvas) {
    N.MU5yPjvq(nativeAwPicture, caller, canvas);
  }

  public static AwPicture.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.gfx.AwPicture.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AwPictureJni();
  }
}
