package org.chromium.components.embedder_support.delegate;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ColorChooserAndroidJni implements ColorChooserAndroid.Natives {
  private static ColorChooserAndroid.Natives testInstance;

  public static final JniStaticTestMocker<ColorChooserAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.embedder_support.delegate.ColorChooserAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.embedder_support.delegate.ColorChooserAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onColorChosen(long nativeColorChooserAndroid, ColorChooserAndroid caller, int color) {
    N.M2zph6xH(nativeColorChooserAndroid, caller, color);
  }

  public static ColorChooserAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.embedder_support.delegate.ColorChooserAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ColorChooserAndroidJni();
  }
}
