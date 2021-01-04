package org.chromium.base;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class TraceEventJni implements TraceEvent.Natives {
  private static TraceEvent.Natives testInstance;

  public static final JniStaticTestMocker<TraceEvent.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.TraceEvent.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.TraceEvent.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void registerEnabledObserver() {
    N.MFFzPOVw();
  }

  @Override
  public void startATrace() {
    N.MRN$Vid3();
  }

  @Override
  public void stopATrace() {
    N.MOgCa3d$();
  }

  @Override
  public void instant(String name, String arg) {
    N.ML40H8ed(name, arg);
  }

  @Override
  public void begin(String name, String arg) {
    N.M9XfPu17(name, arg);
  }

  @Override
  public void end(String name, String arg) {
    N.Mw73xTww(name, arg);
  }

  @Override
  public void beginToplevel(String target) {
    N.M_y76mct(target);
  }

  @Override
  public void endToplevel(String target) {
    N.MLJecZJ9(target);
  }

  @Override
  public void startAsync(String name, long id) {
    N.MHopMqLX(name, id);
  }

  @Override
  public void finishAsync(String name, long id) {
    N.MffNhCLU(name, id);
  }

  public static TraceEvent.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.TraceEvent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new TraceEventJni();
  }
}
