package com.kodilla.foodShopPractice;

import java.util.Map;

public class OrderProcessor {
    public void processOrder(OrderDto orderDto) {
        for (Map.Entry<ProductDto, Integer> entry : orderDto.getProducts().entrySet()) {
            ProductDto key = entry.getKey();
            Integer value = entry.getValue();
            key.getSupplier()
                    .showMessage();
            key.getSupplier()
                    .process(key.getName(), value);
        }
    }
}
