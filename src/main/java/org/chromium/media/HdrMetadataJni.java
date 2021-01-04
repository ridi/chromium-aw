package org.chromium.media;

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
final class HdrMetadataJni implements HdrMetadata.Natives {
  private static HdrMetadata.Natives testInstance;

  public static final JniStaticTestMocker<HdrMetadata.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.media.HdrMetadata.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.media.HdrMetadata.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int primaries(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)N.M6EY_9Mw(nativeJniHdrMetadata, caller);
  }

  @Override
  public int colorTransfer(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)N.Myx2EYmS(nativeJniHdrMetadata, caller);
  }

  @Override
  public int range(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)N.MGKRBsYQ(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryRChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.Mc0wiJ8$(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryRChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.MYP0SLZ2(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryGChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.MRQrYl4t(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryGChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.MtgfnGGz(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryBChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.McEG$Qxu(nativeJniHdrMetadata, caller);
  }

  @Override
  public float primaryBChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.MU6WBitK(nativeJniHdrMetadata, caller);
  }

  @Override
  public float whitePointChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.M8pzdQ$h(nativeJniHdrMetadata, caller);
  }

  @Override
  public float whitePointChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.MXbY07SE(nativeJniHdrMetadata, caller);
  }

  @Override
  public float maxMasteringLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.MOL90CVq(nativeJniHdrMetadata, caller);
  }

  @Override
  public float minMasteringLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (float)N.MM07Xk18(nativeJniHdrMetadata, caller);
  }

  @Override
  public int maxContentLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)N.MMmvZ$nS(nativeJniHdrMetadata, caller);
  }

  @Override
  public int maxFrameAverageLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
    return (int)N.MzRCryEE(nativeJniHdrMetadata, caller);
  }

  public static HdrMetadata.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.HdrMetadata.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new HdrMetadataJni();
  }
}
