package org.chromium.content.browser.input;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TextSuggestionHostJni implements TextSuggestionHost.Natives {
  private static TextSuggestionHost.Natives testInstance;

  public static final JniStaticTestMocker<TextSuggestionHost.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.input.TextSuggestionHost.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.input.TextSuggestionHost.Natives instance) {
      if (!J.N.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void applySpellCheckSuggestion(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller, String suggestion) {
    N.M7RnYR2r(nativeTextSuggestionHostAndroid, caller, suggestion);
  }

  @Override
  public void applyTextSuggestion(long nativeTextSuggestionHostAndroid, TextSuggestionHost caller,
      int markerTag, int suggestionIndex) {
    N.MIADbBhq(nativeTextSuggestionHostAndroid, caller, markerTag, suggestionIndex);
  }

  @Override
  public void deleteActiveSuggestionRange(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller) {
    N.MCBTtv2g(nativeTextSuggestionHostAndroid, caller);
  }

  @Override
  public void onNewWordAddedToDictionary(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller, String word) {
    N.MpJ8AQhr(nativeTextSuggestionHostAndroid, caller, word);
  }

  @Override
  public void onSuggestionMenuClosed(long nativeTextSuggestionHostAndroid,
      TextSuggestionHost caller) {
    N.MnvYa0QF(nativeTextSuggestionHostAndroid, caller);
  }

  public static TextSuggestionHost.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.TextSuggestionHost.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TextSuggestionHostJni();
  }
}
