package com.kodilla.foodShopPractice;

public interface Supplier {
    default void showMessage() {
        System.out.println();
        System.out.println("Next supplier: ");

    }
    void process(String product, Integer count);
}
