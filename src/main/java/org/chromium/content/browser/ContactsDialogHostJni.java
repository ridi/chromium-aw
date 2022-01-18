package org.chromium.content.browser;

import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ContactsDialogHostJni implements ContactsDialogHost.Natives {
  private static ContactsDialogHost.Natives testInstance;

  public static final JniStaticTestMocker<ContactsDialogHost.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ContactsDialogHost.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ContactsDialogHost.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void addContact(long nativeContactsProviderAndroid, String[] names, String[] emails,
      String[] tel, ByteBuffer[] addresses, ByteBuffer[] icons) {
    GEN_JNI.org_chromium_content_browser_ContactsDialogHost_addContact(nativeContactsProviderAndroid, names, emails, tel, addresses, icons);
  }

  @Override
  public void endContactsList(long nativeContactsProviderAndroid, int percentageShared,
      int propertiesRequested) {
    GEN_JNI.org_chromium_content_browser_ContactsDialogHost_endContactsList(nativeContactsProviderAndroid, percentageShared, propertiesRequested);
  }

  @Override
  public void endWithPermissionDenied(long nativeContactsProviderAndroid) {
    GEN_JNI.org_chromium_content_browser_ContactsDialogHost_endWithPermissionDenied(nativeContactsProviderAndroid);
  }

  public static ContactsDialogHost.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContactsDialogHost.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContactsDialogHostJni();
  }
}
