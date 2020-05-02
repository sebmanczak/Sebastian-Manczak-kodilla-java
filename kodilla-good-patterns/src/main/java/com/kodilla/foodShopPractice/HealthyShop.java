package com.kodilla.foodShopPractice;

public class HealthyShop implements Supplier {
    @Override
    public void process(String product, Integer count) {
        System.out.println("Delivery form Healthy Shop");
        System.out.println("Products delivered: " + product + ", Amount: " + count);
    }
}
