package org.chromium.ui.resources;

import J.N;
import android.graphics.Bitmap;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class ResourceManagerJni implements ResourceManager.Natives {
  private static ResourceManager.Natives testInstance;

  public static final JniStaticTestMocker<ResourceManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.resources.ResourceManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.resources.ResourceManager.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onResourceReady(long nativeResourceManagerImpl, ResourceManager caller, int resType,
      int resId, Bitmap bitmap, int width, int height, long nativeResource) {
    N.MM7E4tBk(nativeResourceManagerImpl, caller, resType, resId, bitmap, width, height, nativeResource);
  }

  @Override
  public void removeResource(long nativeResourceManagerImpl, ResourceManager caller, int resType,
      int resId) {
    N.MxwZmAzJ(nativeResourceManagerImpl, caller, resType, resId);
  }

  @Override
  public void clearTintedResourceCache(long nativeResourceManagerImpl, ResourceManager caller) {
    N.MnAVuP1v(nativeResourceManagerImpl, caller);
  }

  public static ResourceManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.resources.ResourceManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ResourceManagerJni();
  }
}
