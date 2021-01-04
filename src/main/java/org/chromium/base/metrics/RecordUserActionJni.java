package org.chromium.base.metrics;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RecordUserActionJni implements RecordUserAction.Natives {
  private static RecordUserAction.Natives testInstance;

  public static final JniStaticTestMocker<RecordUserAction.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.metrics.RecordUserAction.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.metrics.RecordUserAction.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordUserAction(String action) {
    N.MlFl3ytt(action);
  }

  @Override
  public long addActionCallbackForTesting(RecordUserAction.UserActionCallback callback) {
    return (long)N.MH0bOwlk(callback);
  }

  @Override
  public void removeActionCallbackForTesting(long callbackId) {
    N.MJl0LdjQ(callbackId);
  }

  public static RecordUserAction.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.metrics.RecordUserAction.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecordUserActionJni();
  }
}
