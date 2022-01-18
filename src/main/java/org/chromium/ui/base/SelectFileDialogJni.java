package org.chromium.ui.base;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class SelectFileDialogJni implements SelectFileDialog.Natives {
  private static SelectFileDialog.Natives testInstance;

  public static final JniStaticTestMocker<SelectFileDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.SelectFileDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.SelectFileDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onFileSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller,
      String filePath, String displayName) {
    GEN_JNI.org_chromium_ui_base_SelectFileDialog_onFileSelected(nativeSelectFileDialogImpl, caller, filePath, displayName);
  }

  @Override
  public void onMultipleFilesSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller,
      String[] filePathArray, String[] displayNameArray) {
    GEN_JNI.org_chromium_ui_base_SelectFileDialog_onMultipleFilesSelected(nativeSelectFileDialogImpl, caller, filePathArray, displayNameArray);
  }

  @Override
  public void onFileNotSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller) {
    GEN_JNI.org_chromium_ui_base_SelectFileDialog_onFileNotSelected(nativeSelectFileDialogImpl, caller);
  }

  @Override
  public void onContactsSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller,
      String contacts) {
    GEN_JNI.org_chromium_ui_base_SelectFileDialog_onContactsSelected(nativeSelectFileDialogImpl, caller, contacts);
  }

  public static SelectFileDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.SelectFileDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SelectFileDialogJni();
  }
}
