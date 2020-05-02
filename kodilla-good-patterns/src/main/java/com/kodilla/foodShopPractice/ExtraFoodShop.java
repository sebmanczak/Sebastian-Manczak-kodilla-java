package com.kodilla.foodShopPractice;

public class ExtraFoodShop implements Supplier {
    @Override
    public void process(String product, Integer count) {
        System.out.println("Delivery from Extra Food Shop");
        System.out.println("Products delivered: " + product + ", Amount: " + count);
        if (count < 10) {
            System.out.println("Not enough, inform the purchase manager!");
        } else {
            System.out.println("All good, no action required.");
        }
        if (product == "Loin of Pork") {
            System.out.println("Quality alert: Check the quality immediately!");
        }
    }
}
