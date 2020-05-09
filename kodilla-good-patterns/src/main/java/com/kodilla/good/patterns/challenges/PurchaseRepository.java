package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class PurchaseRepository implements StockIndicator {
    @Override
    public void createPurchase(Buyer buyer, Map<Product, Integer> products) {
        System.out.println();
        System.out.println("New order. Authorisation to release the following: " + products );
    }

    //zapisac
}
