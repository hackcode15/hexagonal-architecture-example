package com.app.examplehexagonalarchitecture.usecase;

import com.app.examplehexagonalarchitecture.domain.model.Product;
import com.app.examplehexagonalarchitecture.domain.repository.ProductRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductInteractor implements IProductInteractor {

    private final ProductRepositoryPort productRepositoryPort;

    @Override
    public Product findByProductId(String productId) {
        return productRepositoryPort.findProductByProductId(productId);
    }

}

// Aconsejado no usar @Autowired
// Uso una inyeccion por campo y no por constructor
