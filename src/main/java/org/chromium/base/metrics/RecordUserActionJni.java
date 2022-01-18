package org.chromium.base.metrics;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class RecordUserActionJni implements RecordUserAction.Natives {
  private static RecordUserAction.Natives testInstance;

  public static final JniStaticTestMocker<RecordUserAction.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.metrics.RecordUserAction.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.metrics.RecordUserAction.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long addActionCallbackForTesting(RecordUserAction.UserActionCallback callback) {
    return (long)GEN_JNI.org_chromium_base_metrics_RecordUserAction_addActionCallbackForTesting(callback);
  }

  @Override
  public void removeActionCallbackForTesting(long callbackId) {
    GEN_JNI.org_chromium_base_metrics_RecordUserAction_removeActionCallbackForTesting(callbackId);
  }

  public static RecordUserAction.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.RecordUserAction.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecordUserActionJni();
  }
}
