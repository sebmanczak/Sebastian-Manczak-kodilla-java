package com.kodilla.foodShopPractice;

public class ExtraFoodShop implements Supplier {
    @Override
    public void process(String product, Integer count) {
        System.out.println("Product ordered: " + product + ", Amount: " + count);
    }
}
