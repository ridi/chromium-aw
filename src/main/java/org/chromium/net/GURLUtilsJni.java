package org.chromium.net;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class GURLUtilsJni implements GURLUtils.Natives {
  private static GURLUtils.Natives testInstance;

  public static final JniStaticTestMocker<GURLUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.GURLUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.GURLUtils.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getOrigin(String url) {
    return (String)N.MpCt7siL(url);
  }

  @Override
  public String getScheme(String url) {
    return (String)N.M$mITdbo(url);
  }

  public static GURLUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.GURLUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GURLUtilsJni();
  }
}
