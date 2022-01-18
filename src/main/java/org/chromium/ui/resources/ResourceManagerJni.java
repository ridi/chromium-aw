package org.chromium.ui.resources;

import android.graphics.Bitmap;
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
class ResourceManagerJni implements ResourceManager.Natives {
  private static ResourceManager.Natives testInstance;

  public static final JniStaticTestMocker<ResourceManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.resources.ResourceManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.resources.ResourceManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onResourceReady(long nativeResourceManagerImpl, ResourceManager caller, int resType,
      int resId, Bitmap bitmap, int width, int height, long nativeResource) {
    GEN_JNI.org_chromium_ui_resources_ResourceManager_onResourceReady(nativeResourceManagerImpl, caller, resType, resId, bitmap, width, height, nativeResource);
  }

  @Override
  public void removeResource(long nativeResourceManagerImpl, ResourceManager caller, int resType,
      int resId) {
    GEN_JNI.org_chromium_ui_resources_ResourceManager_removeResource(nativeResourceManagerImpl, caller, resType, resId);
  }

  @Override
  public void clearTintedResourceCache(long nativeResourceManagerImpl, ResourceManager caller) {
    GEN_JNI.org_chromium_ui_resources_ResourceManager_clearTintedResourceCache(nativeResourceManagerImpl, caller);
  }

  public static ResourceManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.resources.ResourceManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ResourceManagerJni();
  }
}
