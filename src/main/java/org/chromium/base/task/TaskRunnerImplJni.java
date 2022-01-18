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
class TaskRunnerImplJni implements TaskRunnerImpl.Natives {
  private static TaskRunnerImpl.Natives testInstance;

  public static final JniStaticTestMocker<TaskRunnerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.task.TaskRunnerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.task.TaskRunnerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(int taskRunnerType, int priority, boolean mayBlock, boolean useThreadPool,
      byte extensionId, byte[] extensionData) {
    return (long)GEN_JNI.org_chromium_base_task_TaskRunnerImpl_init(taskRunnerType, priority, mayBlock, useThreadPool, extensionId, extensionData);
  }

  @Override
  public void destroy(long nativeTaskRunnerAndroid) {
    GEN_JNI.org_chromium_base_task_TaskRunnerImpl_destroy(nativeTaskRunnerAndroid);
  }

  @Override
  public void postDelayedTask(long nativeTaskRunnerAndroid, Runnable task, long delay,
      String runnableClassName) {
    GEN_JNI.org_chromium_base_task_TaskRunnerImpl_postDelayedTask(nativeTaskRunnerAndroid, task, delay, runnableClassName);
  }

  @Override
  public boolean belongsToCurrentThread(long nativeTaskRunnerAndroid) {
    return (boolean)GEN_JNI.org_chromium_base_task_TaskRunnerImpl_belongsToCurrentThread(nativeTaskRunnerAndroid);
  }

  public static TaskRunnerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.task.TaskRunnerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TaskRunnerImplJni();
  }
}
