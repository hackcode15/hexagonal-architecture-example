package com.app.examplehexagonalarchitecture.infrastructure.rest.mapper;

import com.app.examplehexagonalarchitecture.domain.model.Product;
import com.app.examplehexagonalarchitecture.infrastructure.rest.dto.ProductDto;

public class ProductDtoMapper {

    public static ProductDto fromProductToDto(Product product) {

        return new ProductDto(
            product.getProductId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getCurrency()
        );

    }

}
