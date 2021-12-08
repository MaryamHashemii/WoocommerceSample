// Generated by Dagger (https://dagger.dev).
package com.woocer.test.util;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkConnectivity_Factory implements Factory<NetworkConnectivity> {
  private final Provider<Context> contextProvider;

  public NetworkConnectivity_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkConnectivity get() {
    return newInstance(contextProvider.get());
  }

  public static NetworkConnectivity_Factory create(Provider<Context> contextProvider) {
    return new NetworkConnectivity_Factory(contextProvider);
  }

  public static NetworkConnectivity newInstance(Context context) {
    return new NetworkConnectivity(context);
  }
}