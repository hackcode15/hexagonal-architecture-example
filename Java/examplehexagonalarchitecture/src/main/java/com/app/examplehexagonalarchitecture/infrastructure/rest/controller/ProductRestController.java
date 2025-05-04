package com.app.examplehexagonalarchitecture.infrastructure.rest.controller;

import com.app.examplehexagonalarchitecture.infrastructure.rest.dto.ProductDto;
import com.app.examplehexagonalarchitecture.infrastructure.rest.mapper.ProductDtoMapper;
import com.app.examplehexagonalarchitecture.usecase.IProductInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/hexagonal/products")
@RestController
public class ProductRestController {

    private final IProductInteractor productInteractor;

    @GetMapping("/{productId}")
    public ProductDto findProductByProductId(@PathVariable String productId) {
        return ProductDtoMapper.fromProductToDto(productInteractor.findByProductId(productId));
    }

}
