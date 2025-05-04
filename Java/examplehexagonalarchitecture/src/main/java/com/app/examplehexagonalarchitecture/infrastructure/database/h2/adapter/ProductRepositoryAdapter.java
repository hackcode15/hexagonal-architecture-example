package com.app.examplehexagonalarchitecture.infrastructure.database.h2.adapter;

import com.app.examplehexagonalarchitecture.domain.model.Product;
import com.app.examplehexagonalarchitecture.domain.repository.ProductRepositoryPort;
import com.app.examplehexagonalarchitecture.infrastructure.database.h2.repository.ProductJpaRepository;
import com.app.examplehexagonalarchitecture.infrastructure.database.h2.mapper.ProductEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public Optional<Product> findById(String productId) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void deleteById(String productId) {

    }

    @Override
    public Product findProductByProductId(String productId) {
        return productJpaRepository.findProductByProductId(productId)
                .map(ProductEntityMapper::fromEntityToProduct)
                .orElseThrow(() -> new NoSuchElementException("Product not found"));
    }

}
