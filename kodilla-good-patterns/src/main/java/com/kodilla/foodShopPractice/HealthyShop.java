package com.kodilla.foodShopPractice;

public class HealthyShop implements Supplier {
    @Override
    public void process(String product, Integer count) {

        boolean isTested;
        isTested = true;

        if (isTested) {
            System.out.println("The batch is tested and approved.");
        } else {
            System.out.println("The batch is not tested and not approved.");
        }

        System.out.println("Product ordered: " + product + ", Amount: " + count + "Status: " + isTested);
    }
}
