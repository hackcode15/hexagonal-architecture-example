package com.app.examplehexagonalarchitecture.infrastructure.database.h2.mapper;

import com.app.examplehexagonalarchitecture.domain.model.Product;
import com.app.examplehexagonalarchitecture.infrastructure.database.h2.entity.ProductEntity;

//@Component
public class ProductEntityMapper {

    public static Product fromEntityToProduct(ProductEntity productEntity) {

        return new Product(
                productEntity.getProductId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice(),
                productEntity.getCurrency()
        );

    }

}
