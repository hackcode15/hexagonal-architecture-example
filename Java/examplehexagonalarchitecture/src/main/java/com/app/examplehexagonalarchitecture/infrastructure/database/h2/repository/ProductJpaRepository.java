package com.app.examplehexagonalarchitecture.infrastructure.database.h2.repository;

import com.app.examplehexagonalarchitecture.infrastructure.database.h2.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, UUID> {

    Optional<ProductEntity> findProductByProductId(String productId);

}
