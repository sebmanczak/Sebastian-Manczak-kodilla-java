package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public boolean purchase(Buyer buyer, Map<Product, Integer> products) {
        System.out.println();
        System.out.println("Determination if the buyer ordered less than 10 products: ");
        boolean found = products.entrySet().stream().filter(e -> e.getValue() < 10).map(e -> true).findAny().orElse(false);
        System.out.println(found);
        return true;
    }
}
