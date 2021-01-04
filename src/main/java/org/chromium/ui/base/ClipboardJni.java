package org.chromium.ui.base;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ClipboardJni implements Clipboard.Natives {
  private static Clipboard.Natives testInstance;

  public static final JniStaticTestMocker<Clipboard.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.Clipboard.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.Clipboard.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onPrimaryClipChanged(long nativeClipboardAndroid, Clipboard caller) {
    N.M3YqItLq(nativeClipboardAndroid, caller);
  }

  @Override
  public void onPrimaryClipTimestampInvalidated(long nativeClipboardAndroid, Clipboard caller,
      long timestamp) {
    N.MWrNP8sy(nativeClipboardAndroid, caller, timestamp);
  }

  @Override
  public long getLastModifiedTimeToJavaTime(long nativeClipboardAndroid) {
    return (long)N.MN49cYVC(nativeClipboardAndroid);
  }

  public static Clipboard.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.Clipboard.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ClipboardJni();
  }
}
