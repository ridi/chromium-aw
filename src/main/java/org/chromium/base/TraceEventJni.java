package org.chromium.base;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class TraceEventJni implements TraceEvent.Natives {
  private static TraceEvent.Natives testInstance;

  public static final JniStaticTestMocker<TraceEvent.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.TraceEvent.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.TraceEvent.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void registerEnabledObserver() {
    GEN_JNI.org_chromium_base_TraceEvent_registerEnabledObserver();
  }

  @Override
  public void startATrace(String categoryFilter) {
    GEN_JNI.org_chromium_base_TraceEvent_startATrace(categoryFilter);
  }

  @Override
  public void stopATrace() {
    GEN_JNI.org_chromium_base_TraceEvent_stopATrace();
  }

  @Override
  public void setupATraceStartupTrace(String categoryFilter) {
    GEN_JNI.org_chromium_base_TraceEvent_setupATraceStartupTrace(categoryFilter);
  }

  @Override
  public void instant(String name, String arg) {
    GEN_JNI.org_chromium_base_TraceEvent_instant(name, arg);
  }

  @Override
  public void begin(String name, String arg) {
    GEN_JNI.org_chromium_base_TraceEvent_begin(name, arg);
  }

  @Override
  public void end(String name, String arg) {
    GEN_JNI.org_chromium_base_TraceEvent_end(name, arg);
  }

  @Override
  public void beginToplevel(String target) {
    GEN_JNI.org_chromium_base_TraceEvent_beginToplevel(target);
  }

  @Override
  public void endToplevel(String target) {
    GEN_JNI.org_chromium_base_TraceEvent_endToplevel(target);
  }

  @Override
  public void startAsync(String name, long id) {
    GEN_JNI.org_chromium_base_TraceEvent_startAsync(name, id);
  }

  @Override
  public void finishAsync(String name, long id) {
    GEN_JNI.org_chromium_base_TraceEvent_finishAsync(name, id);
  }

  public static TraceEvent.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.TraceEvent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new TraceEventJni();
  }
}
