package org.chromium.android_webview.variations;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class VariationsSeedLoaderJni implements VariationsSeedLoader.Natives {
  private static VariationsSeedLoader.Natives testInstance;

  public static final JniStaticTestMocker<VariationsSeedLoader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.variations.VariationsSeedLoader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.variations.VariationsSeedLoader.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean parseAndSaveSeedProto(String path) {
    return (boolean)GEN_JNI.org_chromium_android_1webview_variations_VariationsSeedLoader_parseAndSaveSeedProto(path);
  }

  @Override
  public long getSavedSeedDate() {
    return (long)GEN_JNI.org_chromium_android_1webview_variations_VariationsSeedLoader_getSavedSeedDate();
  }

  public static VariationsSeedLoader.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.variations.VariationsSeedLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VariationsSeedLoaderJni();
  }
}
