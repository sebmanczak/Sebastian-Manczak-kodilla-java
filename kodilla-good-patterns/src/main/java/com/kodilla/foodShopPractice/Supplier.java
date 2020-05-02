package com.kodilla.foodShopPractice;

public interface Supplier {
    default public void showMessage() {
        System.out.println();
        System.out.println("Next supplier: ");
        //System.out.println();
    }
    void process(String product, Integer count);
}
