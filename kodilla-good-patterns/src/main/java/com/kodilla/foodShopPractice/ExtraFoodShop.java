package com.kodilla.foodShopPractice;

public class ExtraFoodShop implements Supplier {
    @Override
    public void process(String product, Integer count) {
        System.out.println("Delivery from Extra Food Shop");
        System.out.println("Products delivered: " + product + ", Amount: " + count);
    }
}
