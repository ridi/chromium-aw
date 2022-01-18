package org.chromium.base.task;

import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class PostTaskJni implements PostTask.Natives {
  private static PostTask.Natives testInstance;

  public static final JniStaticTestMocker<PostTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.task.PostTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.task.PostTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void postDelayedTask(int priority, boolean mayBlock, boolean useThreadPool,
      byte extensionId, byte[] extensionData, Runnable task, long delay, String runnableClassName) {
    GEN_JNI.org_chromium_base_task_PostTask_postDelayedTask(priority, mayBlock, useThreadPool, extensionId, extensionData, task, delay, runnableClassName);
  }

  public static PostTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.task.PostTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PostTaskJni();
  }
}
