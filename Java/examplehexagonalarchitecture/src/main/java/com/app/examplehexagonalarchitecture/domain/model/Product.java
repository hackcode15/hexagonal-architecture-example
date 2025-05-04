package com.app.examplehexagonalarchitecture.domain.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
//@AllArgsConstructor
public class Product {

    private String productId;
    private String name;
    private String description;

    @NotNull
    @Min(value = 0, message = "Price must be positive")
    private BigDecimal price;

    @NotNull
    @Pattern(regexp = "[$€]", message = "Currency must ...")
    private String currency;

    public Product(String productId, String name, String description, BigDecimal price, String currency) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        validate();
    }

    private void validate() {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        if (!currency.matches("[$€]")) {
            throw new IllegalArgumentException("Invalid currency");
        }
    }

    // Comportamientos del dominio
    public void updatePrice(BigDecimal newPrice) {
        this.price = newPrice;
        validate();
    }

}
