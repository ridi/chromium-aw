package org.chromium.base.task;

import J.N;
import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TaskRunnerImplJni implements TaskRunnerImpl.Natives {
  private static TaskRunnerImpl.Natives testInstance;

  public static final JniStaticTestMocker<TaskRunnerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.task.TaskRunnerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.task.TaskRunnerImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(int taskRunnerType, boolean prioritySetExplicitly, int priority,
      boolean mayBlock, boolean useThreadPool, byte extensionId, byte[] extensionData) {
    return (long)N.M5_IQXaH(taskRunnerType, prioritySetExplicitly, priority, mayBlock, useThreadPool, extensionId, extensionData);
  }

  @Override
  public void destroy(long nativeTaskRunnerAndroid) {
    N.MERCiIV8(nativeTaskRunnerAndroid);
  }

  @Override
  public void postDelayedTask(long nativeTaskRunnerAndroid, Runnable task, long delay) {
    N.MGnQU$47(nativeTaskRunnerAndroid, task, delay);
  }

  @Override
  public boolean belongsToCurrentThread(long nativeTaskRunnerAndroid) {
    return (boolean)N.MdFi6sVQ(nativeTaskRunnerAndroid);
  }

  public static TaskRunnerImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.task.TaskRunnerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TaskRunnerImplJni();
  }
}
