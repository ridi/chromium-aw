package org.chromium.components.autofill;

import android.view.View;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class AutofillProviderJni implements AutofillProvider.Natives {
  private static AutofillProvider.Natives testInstance;

  public static final JniStaticTestMocker<AutofillProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.autofill.AutofillProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.autofill.AutofillProvider.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(AutofillProvider caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_autofill_AutofillProvider_init(caller, webContents);
  }

  @Override
  public void detachFromJavaAutofillProvider(long nativeAutofillProviderAndroid) {
    GEN_JNI.org_chromium_components_autofill_AutofillProvider_detachFromJavaAutofillProvider(nativeAutofillProviderAndroid);
  }

  @Override
  public void onAutofillAvailable(long nativeAutofillProviderAndroid, AutofillProvider caller,
      FormData formData) {
    GEN_JNI.org_chromium_components_autofill_AutofillProvider_onAutofillAvailable(nativeAutofillProviderAndroid, caller, formData);
  }

  @Override
  public void onAcceptDataListSuggestion(long nativeAutofillProviderAndroid,
      AutofillProvider caller, String value) {
    GEN_JNI.org_chromium_components_autofill_AutofillProvider_onAcceptDataListSuggestion(nativeAutofillProviderAndroid, caller, value);
  }

  @Override
  public void setAnchorViewRect(long nativeAutofillProviderAndroid, AutofillProvider caller,
      View anchorView, float x, float y, float width, float height) {
    GEN_JNI.org_chromium_components_autofill_AutofillProvider_setAnchorViewRect(nativeAutofillProviderAndroid, caller, anchorView, x, y, width, height);
  }

  @Override
  public boolean isQueryServerFieldTypesEnabled() {
    return (boolean)GEN_JNI.org_chromium_components_autofill_AutofillProvider_isQueryServerFieldTypesEnabled();
  }

  public static AutofillProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.autofill.AutofillProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillProviderJni();
  }
}
