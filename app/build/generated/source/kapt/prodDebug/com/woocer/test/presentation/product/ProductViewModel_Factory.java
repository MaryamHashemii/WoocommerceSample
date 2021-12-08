// Generated by Dagger (https://dagger.dev).
package com.woocer.test.presentation.product;

import com.woocer.test.domain.usecase.ProductUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductViewModel_Factory implements Factory<ProductViewModel> {
  private final Provider<ProductUseCase> productUseCaseProvider;

  public ProductViewModel_Factory(Provider<ProductUseCase> productUseCaseProvider) {
    this.productUseCaseProvider = productUseCaseProvider;
  }

  @Override
  public ProductViewModel get() {
    return newInstance(productUseCaseProvider.get());
  }

  public static ProductViewModel_Factory create(Provider<ProductUseCase> productUseCaseProvider) {
    return new ProductViewModel_Factory(productUseCaseProvider);
  }

  public static ProductViewModel newInstance(ProductUseCase productUseCase) {
    return new ProductViewModel(productUseCase);
  }
}