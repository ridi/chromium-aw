package org.chromium.ui.resources;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ResourceFactoryJni implements ResourceFactory.Natives {
  private static ResourceFactory.Natives testInstance;

  public static final JniStaticTestMocker<ResourceFactory.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.resources.ResourceFactory.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.resources.ResourceFactory.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createBitmapResource() {
    return (long)N.MKzrMxwv();
  }

  @Override
  public long createNinePatchBitmapResource(int paddingLeft, int paddingTop, int paddingRight,
      int paddingBottom, int apertureLeft, int apertureTop, int apertureRight, int apertureBottom) {
    return (long)N.MNZCYawX(paddingLeft, paddingTop, paddingRight, paddingBottom, apertureLeft, apertureTop, apertureRight, apertureBottom);
  }

  public static ResourceFactory.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.resources.ResourceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ResourceFactoryJni();
  }
}
