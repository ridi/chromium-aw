package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AppWebMessagePortDescriptorJni implements AppWebMessagePortDescriptor.Native {
  private static AppWebMessagePortDescriptor.Native testInstance;

  public static final JniStaticTestMocker<AppWebMessagePortDescriptor.Native> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.AppWebMessagePortDescriptor.Native>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.AppWebMessagePortDescriptor.Native instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long[] createPair() {
    return (long[])N.MZ2WfWkn();
  }

  @Override
  public long create(int nativeHandle, long idLow, long idHigh, long sequenceNumber) {
    return (long)N.MsjrrfZt(nativeHandle, idLow, idHigh, sequenceNumber);
  }

  @Override
  public int takeHandleToEntangle(long blinkMessagePortDescriptor) {
    return (int)N.MbOQIpGw(blinkMessagePortDescriptor);
  }

  @Override
  public void giveDisentangledHandle(long blinkMessagePortDescriptor, int nativeHandle) {
    N.MylsTJ$B(blinkMessagePortDescriptor, nativeHandle);
  }

  @Override
  public long[] passSerialized(long blinkMessagePortDescriptor) {
    return (long[])N.MJJP$CQY(blinkMessagePortDescriptor);
  }

  @Override
  public void closeAndDestroy(long blinkMessagePortDescriptor) {
    N.MWkkqfl2(blinkMessagePortDescriptor);
  }

  public static AppWebMessagePortDescriptor.Native get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AppWebMessagePortDescriptor.Native. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AppWebMessagePortDescriptorJni();
  }
}
