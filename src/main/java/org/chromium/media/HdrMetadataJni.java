package org.chromium.media;

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
class HdrMetadataJni implements HdrMetadata.Natives {
  private static HdrMetadata.Natives testInstance;

  public static final JniStaticTestMocker<HdrMetadata.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.HdrMetadata.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.HdrMetadata.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int primaries(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)GEN_JNI.org_chromium_media_HdrMetadata_primaries(nativeJniHdrMetadata, caller);
  }

  @Override
  public int colorTransfer(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)GEN_JNI.org_chromium_media_HdrMetadata_colorTransfer(nativeJniHdrMetadata, caller);
  }

  @Override
  public int range(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)GEN_JNI.org_chromium_media_HdrMetadata_range(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryRChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_primaryRChromaticityX(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryRChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_primaryRChromaticityY(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryGChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_primaryGChromaticityX(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryGChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_primaryGChromaticityY(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryBChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_primaryBChromaticityX(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryBChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_primaryBChromaticityY(nativeJniHdrMetadata, caller);
  }

  @Override
  public float whitePointChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_whitePointChromaticityX(nativeJniHdrMetadata, caller);
  }

  @Override
  public float whitePointChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_whitePointChromaticityY(nativeJniHdrMetadata, caller);
  }

  @Override
  public float maxColorVolumeLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_maxColorVolumeLuminance(nativeJniHdrMetadata, caller);
  }

  @Override
  public float minColorVolumeLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)GEN_JNI.org_chromium_media_HdrMetadata_minColorVolumeLuminance(nativeJniHdrMetadata, caller);
  }

  @Override
  public int maxContentLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)GEN_JNI.org_chromium_media_HdrMetadata_maxContentLuminance(nativeJniHdrMetadata, caller);
  }

  @Override
  public int maxFrameAverageLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)GEN_JNI.org_chromium_media_HdrMetadata_maxFrameAverageLuminance(nativeJniHdrMetadata, caller);
  }

  public static HdrMetadata.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.HdrMetadata.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new HdrMetadataJni();
  }
}
