package org.chromium.content.browser.selection;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SelectionPopupControllerImplJni implements SelectionPopupControllerImpl.Natives {
  private static SelectionPopupControllerImpl.Natives testInstance;

  public static final JniStaticTestMocker<SelectionPopupControllerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SelectionPopupControllerImpl caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_content_browser_selection_SelectionPopupControllerImpl_init(caller, webContents);
  }

  @Override
  public void setTextHandlesTemporarilyHidden(long nativeSelectionPopupController,
      SelectionPopupControllerImpl caller, boolean hidden) {
    GEN_JNI.org_chromium_content_browser_selection_SelectionPopupControllerImpl_setTextHandlesTemporarilyHidden(nativeSelectionPopupController, caller, hidden);
  }

  public static SelectionPopupControllerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SelectionPopupControllerImplJni();
  }
}
