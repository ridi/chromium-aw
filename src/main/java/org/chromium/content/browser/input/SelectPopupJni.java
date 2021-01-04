package org.chromium.content.browser.input;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SelectPopupJni implements SelectPopup.Natives {
  private static SelectPopup.Natives testInstance;

  public static final JniStaticTestMocker<SelectPopup.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.input.SelectPopup.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.input.SelectPopup.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void selectMenuItems(long nativeSelectPopup, SelectPopup caller,
      long nativeSelectPopupSourceFrame, int[] indices) {
    N.ME0LgXse(nativeSelectPopup, caller, nativeSelectPopupSourceFrame, indices);
  }

  public static SelectPopup.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.SelectPopup.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SelectPopupJni();
  }
}
