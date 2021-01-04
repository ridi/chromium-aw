package org.chromium.ui.gfx;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ViewConfigurationHelperJni implements ViewConfigurationHelper.Natives {
  private static ViewConfigurationHelper.Natives testInstance;

  public static final JniStaticTestMocker<ViewConfigurationHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.gfx.ViewConfigurationHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.gfx.ViewConfigurationHelper.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void updateSharedViewConfiguration(ViewConfigurationHelper caller,
      float maximumFlingVelocity, float minimumFlingVelocity, float touchSlop, float doubleTapSlop,
      float minScalingSpan) {
    N.MtrEpb2R(caller, maximumFlingVelocity, minimumFlingVelocity, touchSlop, doubleTapSlop, minScalingSpan);
  }

  public static ViewConfigurationHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.gfx.ViewConfigurationHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ViewConfigurationHelperJni();
  }
}
