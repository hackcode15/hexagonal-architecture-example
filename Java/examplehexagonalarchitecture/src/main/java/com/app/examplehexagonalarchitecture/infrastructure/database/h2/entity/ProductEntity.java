package com.app.examplehexagonalarchitecture.infrastructure.database.h2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Entity
@Table(name = "tbl_product")
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String productId;
    private String name;
    private String description;
    private BigDecimal price;
    private String currency;

    public ProductEntity(String productId, String name, String description, BigDecimal price, String currency) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
    }

}
