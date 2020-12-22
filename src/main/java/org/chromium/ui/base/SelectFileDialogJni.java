package org.chromium.ui.base;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SelectFileDialogJni implements SelectFileDialog.Natives {
  private static SelectFileDialog.Natives testInstance;

  public static final JniStaticTestMocker<SelectFileDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.ui.base.SelectFileDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.ui.base.SelectFileDialog.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onFileSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller,
      String filePath, String displayName) {
    N.MBeWYy2V(nativeSelectFileDialogImpl, caller, filePath, displayName);
  }

  @Override
  public void onMultipleFilesSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller,
      String[] filePathArray, String[] displayNameArray) {
    N.Mx1807vz(nativeSelectFileDialogImpl, caller, filePathArray, displayNameArray);
  }

  @Override
  public void onFileNotSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller) {
    N.MGVJOCWv(nativeSelectFileDialogImpl, caller);
  }

  @Override
  public void onContactsSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller,
      String contacts) {
    N.MXucAq1Y(nativeSelectFileDialogImpl, caller, contacts);
  }

  public static SelectFileDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.SelectFileDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SelectFileDialogJni();
  }
}
