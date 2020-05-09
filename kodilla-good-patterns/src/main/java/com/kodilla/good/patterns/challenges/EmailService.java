package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class EmailService implements InformationService {
    @Override
    public void inform(Buyer buyer, Map<Product, Integer> products) {
        System.out.println();
        System.out.println("A new order has been made online: \n"
                + "The following items have been purchased: \n"  + products + " \n"
                + "The buyer details: \n"
                + buyer);
    }
}
