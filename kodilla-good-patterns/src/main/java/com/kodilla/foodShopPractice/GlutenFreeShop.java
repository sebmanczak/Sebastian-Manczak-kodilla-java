package com.kodilla.foodShopPractice;

public class GlutenFreeShop implements Supplier {
    @Override
    public void process(String product, Integer count) {
        System.out.println("Delivery from Gluten Free Shop (applied 3% discount)");
        System.out.println("Products delivered: " + product + ", Amount: " + count);
    }
}
