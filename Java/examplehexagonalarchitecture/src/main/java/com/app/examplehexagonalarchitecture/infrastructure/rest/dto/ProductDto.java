package com.app.examplehexagonalarchitecture.infrastructure.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ProductDto {
    private String productId;
    private String name;
    private String description;
    private BigDecimal price;
    private String currency;
}
