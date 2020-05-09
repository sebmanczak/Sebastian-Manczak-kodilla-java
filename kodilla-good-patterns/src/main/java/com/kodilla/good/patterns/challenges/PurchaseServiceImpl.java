package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public boolean purchase(Buyer buyer, Map<Product, Integer> products) {
        System.out.println();
        System.out.println("Purchase service is here");
        //Message for Mateusz:
        // if the number of items < 10 , let the customer know the order is too small
        // how to access the Integer value  in the Map above and put it in the if statement below????
        // I tried and failed in the line below.
        if (products.entrySet().forEach((value) -> value.getValue()); {
            return true;
        } else {
            System.out.println("I'm sorry. The order is too small. The minimum number of items for orders online is 10. ");
            return false;
        }
    }
    //warunek jesli itd
}
