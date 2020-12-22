package org.chromium.base.process_launcher;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class ChildProcessServiceJni implements ChildProcessService.Natives {
  private static ChildProcessService.Natives testInstance;

  public static final JniStaticTestMocker<ChildProcessService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.process_launcher.ChildProcessService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.base.process_launcher.ChildProcessService.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void registerFileDescriptors(String[] keys, int[] id, int[] fd, long[] offset,
      long[] size) {
    N.Ma6rsNQO(keys, id, fd, offset, size);
  }

  @Override
  public void exitChildProcess() {
    N.McvJWQ0j();
  }

  @Override
  public void dumpProcessStack() {
    N.M6Y7Jzgj();
  }

  public static ChildProcessService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.process_launcher.ChildProcessService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ChildProcessServiceJni();
  }
}
