package com.kodilla.foodShopPractice;

import java.util.HashMap;
import java.util.Map;

public class OrderDto {
    private Map<ProductDto, Integer> products = new HashMap<>();

    public void add(ProductDto productDto, Integer count) {
        products.put(productDto, count);
    }

    public Map<ProductDto, Integer> getProducts() {
        return products;
    }
}
