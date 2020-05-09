package com.kodilla.good.patterns.challenges;

import java.util.Map;

public interface StockIndicator {
    void createPurchase(Buyer buyer, Map<Product, Integer> products);
}
