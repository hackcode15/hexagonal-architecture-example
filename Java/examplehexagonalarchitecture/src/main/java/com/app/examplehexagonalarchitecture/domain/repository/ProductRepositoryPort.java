package com.app.examplehexagonalarchitecture.domain.repository;

import com.app.examplehexagonalarchitecture.domain.model.Product;

import java.util.Optional;

public interface ProductRepositoryPort {

    Optional<Product> findById(String productId);
    Product save(Product product);
    void deleteById(String productId);

    Product findProductByProductId(String productoId);

}
