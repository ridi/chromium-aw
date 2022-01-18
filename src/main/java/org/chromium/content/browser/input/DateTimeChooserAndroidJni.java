package org.chromium.content.browser.input;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class DateTimeChooserAndroidJni implements DateTimeChooserAndroid.Natives {
  private static DateTimeChooserAndroid.Natives testInstance;

  public static final JniStaticTestMocker<DateTimeChooserAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.input.DateTimeChooserAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.input.DateTimeChooserAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void replaceDateTime(long nativeDateTimeChooserAndroid, DateTimeChooserAndroid caller,
      double dialogValue) {
    GEN_JNI.org_chromium_content_browser_input_DateTimeChooserAndroid_replaceDateTime(nativeDateTimeChooserAndroid, caller, dialogValue);
  }

  @Override
  public void cancelDialog(long nativeDateTimeChooserAndroid, DateTimeChooserAndroid caller) {
    GEN_JNI.org_chromium_content_browser_input_DateTimeChooserAndroid_cancelDialog(nativeDateTimeChooserAndroid, caller);
  }

  public static DateTimeChooserAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.DateTimeChooserAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DateTimeChooserAndroidJni();
  }
}
