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
class CommandLineJni implements CommandLine.Natives {
  private static CommandLine.Natives testInstance;

  public static final JniStaticTestMocker<CommandLine.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.CommandLine.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.CommandLine.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void init(String[] args) {
    GEN_JNI.org_chromium_base_CommandLine_init(args);
  }

  @Override
  public boolean hasSwitch(String switchString) {
    return (boolean)GEN_JNI.org_chromium_base_CommandLine_hasSwitch(switchString);
  }

  @Override
  public String getSwitchValue(String switchString) {
    return (String)GEN_JNI.org_chromium_base_CommandLine_getSwitchValue(switchString);
  }

  @Override
  public String[] getSwitchesFlattened() {
    return (String[])GEN_JNI.org_chromium_base_CommandLine_getSwitchesFlattened();
  }

  @Override
  public void appendSwitch(String switchString) {
    GEN_JNI.org_chromium_base_CommandLine_appendSwitch(switchString);
  }

  @Override
  public void appendSwitchWithValue(String switchString, String value) {
    GEN_JNI.org_chromium_base_CommandLine_appendSwitchWithValue(switchString, value);
  }

  @Override
  public void appendSwitchesAndArguments(String[] array) {
    GEN_JNI.org_chromium_base_CommandLine_appendSwitchesAndArguments(array);
  }

  @Override
  public void removeSwitch(String switchString) {
    GEN_JNI.org_chromium_base_CommandLine_removeSwitch(switchString);
  }

  public static CommandLine.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.CommandLine.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new CommandLineJni();
  }
}
