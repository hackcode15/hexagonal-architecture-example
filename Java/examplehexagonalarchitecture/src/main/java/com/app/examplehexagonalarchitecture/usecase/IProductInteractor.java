package com.app.examplehexagonalarchitecture.usecase;

import com.app.examplehexagonalarchitecture.domain.model.Product;

public interface IProductInteractor {

    Product findByProductId(String productId);

}
