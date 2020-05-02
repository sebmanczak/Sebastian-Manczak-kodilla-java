package com.kodilla.foodShopPractice;

public class HealthyShop implements Supplier {
    @Override
    public void process(String product, Integer count) {
        System.out.println("Delivery form Healthy Shop");
        System.out.println("Products delivered: " + product + ", Amount: " + count);
        if (count > 50 && count <= 70) {
            System.out.println("All good. No action required.");
        } else if (count > 70 && count <= 90) {
            System.out.println("Advise the supplier we didn't order so much stock!");
        } else {
            System.out.println("Send the extra stock back!");
        }
    }
}
