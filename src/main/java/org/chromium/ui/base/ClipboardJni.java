package org.chromium.ui.base;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ClipboardJni implements Clipboard.Natives {
  private static Clipboard.Natives testInstance;

  public static final JniStaticTestMocker<Clipboard.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.Clipboard.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.Clipboard.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onPrimaryClipChanged(long nativeClipboardAndroid, Clipboard caller) {
    GEN_JNI.org_chromium_ui_base_Clipboard_onPrimaryClipChanged(nativeClipboardAndroid, caller);
  }

  @Override
  public void onPrimaryClipTimestampInvalidated(long nativeClipboardAndroid, Clipboard caller,
      long timestamp) {
    GEN_JNI.org_chromium_ui_base_Clipboard_onPrimaryClipTimestampInvalidated(nativeClipboardAndroid, caller, timestamp);
  }

  @Override
  public long getLastModifiedTimeToJavaTime(long nativeClipboardAndroid) {
    return (long)GEN_JNI.org_chromium_ui_base_Clipboard_getLastModifiedTimeToJavaTime(nativeClipboardAndroid);
  }

  public static Clipboard.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.Clipboard.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ClipboardJni();
  }
}
