package org.whispersystems.libsignal.logging;

public class SignalProtocolLoggerProvider {

  private static SignalProtocolLogger provider;

  public static SignalProtocolLogger getProvider() {
    return provider;
  }

  public static void setProvider(SignalProtocolLogger provider) {
    SignalProtocolLoggerProvider.provider = provider;
  }
}
