package org.chromium.content.browser.input;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DateTimeChooserAndroidJni implements DateTimeChooserAndroid.Natives {
  private static DateTimeChooserAndroid.Natives testInstance;

  public static final JniStaticTestMocker<DateTimeChooserAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.input.DateTimeChooserAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.input.DateTimeChooserAndroid.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void replaceDateTime(long nativeDateTimeChooserAndroid, DateTimeChooserAndroid caller,
      double dialogValue) {
    N.MgUhdCLo(nativeDateTimeChooserAndroid, caller, dialogValue);
  }

  @Override
  public void cancelDialog(long nativeDateTimeChooserAndroid, DateTimeChooserAndroid caller) {
    N.MCtaZNwj(nativeDateTimeChooserAndroid, caller);
  }

  public static DateTimeChooserAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.DateTimeChooserAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DateTimeChooserAndroidJni();
  }
}
