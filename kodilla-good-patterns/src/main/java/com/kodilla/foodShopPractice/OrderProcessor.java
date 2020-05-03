package com.kodilla.foodShopPractice;

public class OrderProcessor {

    public void processOrder(OrderDto orderDto) {
        //orderDto.getProducts().forEach((key, value) -> key.getSupplier().process(key.getName(), value));
        orderDto.getProducts().entrySet().forEach(entry -> {
            ProductDto key = entry.getKey();
            Integer value = entry.getValue();
            key.getSupplier().showMessage();
            key.getSupplier().process(key.getName(), value);
        });
    }

}

