// Generated by Dagger (https://dagger.dev).
package com.woocer.test.di;

import com.woocer.test.data.local.dao.AppDao;
import com.woocer.test.data.local.firebase.FireBaseRepoImpl;
import com.woocer.test.data.remote.ApiService;
import com.woocer.test.domain.repository.AppRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideAppRepositoryFactory implements Factory<AppRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<AppDao> appDaoProvider;

  private final Provider<FireBaseRepoImpl> fireBaseRepoImplProvider;

  public RepositoryModule_ProvideAppRepositoryFactory(Provider<ApiService> apiServiceProvider,
      Provider<AppDao> appDaoProvider, Provider<FireBaseRepoImpl> fireBaseRepoImplProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.appDaoProvider = appDaoProvider;
    this.fireBaseRepoImplProvider = fireBaseRepoImplProvider;
  }

  @Override
  public AppRepository get() {
    return provideAppRepository(apiServiceProvider.get(), appDaoProvider.get(), fireBaseRepoImplProvider.get());
  }

  public static RepositoryModule_ProvideAppRepositoryFactory create(
      Provider<ApiService> apiServiceProvider, Provider<AppDao> appDaoProvider,
      Provider<FireBaseRepoImpl> fireBaseRepoImplProvider) {
    return new RepositoryModule_ProvideAppRepositoryFactory(apiServiceProvider, appDaoProvider, fireBaseRepoImplProvider);
  }

  public static AppRepository provideAppRepository(ApiService apiService, AppDao appDao,
      FireBaseRepoImpl fireBaseRepoImpl) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAppRepository(apiService, appDao, fireBaseRepoImpl));
  }
}
