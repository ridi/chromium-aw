package org.chromium.base.jank_tracker;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class JankMetricUMARecorderJni implements JankMetricUMARecorder.Natives {
  private static JankMetricUMARecorder.Natives testInstance;

  public static final JniStaticTestMocker<JankMetricUMARecorder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.jank_tracker.JankMetricUMARecorder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.base.jank_tracker.JankMetricUMARecorder.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordJankMetrics(String scenarioName, long[] durationsNs, long[] jankBurstsNs,
      int missedFrames) {
    GEN_JNI.org_chromium_base_jank_1tracker_JankMetricUMARecorder_recordJankMetrics(scenarioName, durationsNs, jankBurstsNs, missedFrames);
  }

  public static JankMetricUMARecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.jank_tracker.JankMetricUMARecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JankMetricUMARecorderJni();
  }
}
