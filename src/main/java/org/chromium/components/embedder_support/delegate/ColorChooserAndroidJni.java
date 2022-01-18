package org.chromium.components.embedder_support.delegate;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ColorChooserAndroidJni implements ColorChooserAndroid.Natives {
  private static ColorChooserAndroid.Natives testInstance;

  public static final JniStaticTestMocker<ColorChooserAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.embedder_support.delegate.ColorChooserAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.embedder_support.delegate.ColorChooserAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onColorChosen(long nativeColorChooserAndroid, ColorChooserAndroid caller, int color) {
    GEN_JNI.org_chromium_components_embedder_1support_delegate_ColorChooserAndroid_onColorChosen(nativeColorChooserAndroid, caller, color);
  }

  public static ColorChooserAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.embedder_support.delegate.ColorChooserAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ColorChooserAndroidJni();
  }
}
