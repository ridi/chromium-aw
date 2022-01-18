package org.chromium.components.viz.service.frame_sinks;

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
class ExternalBeginFrameSourceAndroidJni implements ExternalBeginFrameSourceAndroid.Natives {
  private static ExternalBeginFrameSourceAndroid.Natives testInstance;

  public static final JniStaticTestMocker<ExternalBeginFrameSourceAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onVSync(long nativeExternalBeginFrameSourceAndroid,
      ExternalBeginFrameSourceAndroid caller, long vsyncTimeMicros, long vsyncPeriodMicros) {
    GEN_JNI.org_chromium_components_viz_service_frame_1sinks_ExternalBeginFrameSourceAndroid_onVSync(nativeExternalBeginFrameSourceAndroid, caller, vsyncTimeMicros, vsyncPeriodMicros);
  }

  public static ExternalBeginFrameSourceAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ExternalBeginFrameSourceAndroidJni();
  }
}
