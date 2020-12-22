package org.chromium.content.browser;

import J.N;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JavascriptInjectorImplJni implements JavascriptInjectorImpl.Natives {
  private static JavascriptInjectorImpl.Natives testInstance;

  public static final JniStaticTestMocker<JavascriptInjectorImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.JavascriptInjectorImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.JavascriptInjectorImpl.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(JavascriptInjectorImpl caller, WebContents webContents, Object retainedObjects) {
    return (long)N.MaMB25XA(caller, webContents, retainedObjects);
  }

  @Override
  public void setAllowInspection(long nativeJavascriptInjector, JavascriptInjectorImpl caller,
      boolean allow) {
    N.M9VsdpoI(nativeJavascriptInjector, caller, allow);
  }

  @Override
  public void addInterface(long nativeJavascriptInjector, JavascriptInjectorImpl caller,
      Object object, String name, Class requiredAnnotation) {
    N.Mpa5DCUY(nativeJavascriptInjector, caller, object, name, requiredAnnotation);
  }

  @Override
  public void removeInterface(long nativeJavascriptInjector, JavascriptInjectorImpl caller,
      String name) {
    N.M5J62vXh(nativeJavascriptInjector, caller, name);
  }

  public static JavascriptInjectorImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.JavascriptInjectorImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JavascriptInjectorImplJni();
  }
}
