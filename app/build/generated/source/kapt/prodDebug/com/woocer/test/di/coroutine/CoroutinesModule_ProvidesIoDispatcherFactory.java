// Generated by Dagger (https://dagger.dev).
package com.woocer.test.di.coroutine;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoroutinesModule_ProvidesIoDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return providesIoDispatcher();
  }

  public static CoroutinesModule_ProvidesIoDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher providesIoDispatcher() {
    return Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesIoDispatcher());
  }

  private static final class InstanceHolder {
    private static final CoroutinesModule_ProvidesIoDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesIoDispatcherFactory();
  }
}
