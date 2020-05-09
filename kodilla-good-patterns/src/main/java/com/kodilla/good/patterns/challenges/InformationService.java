package com.kodilla.good.patterns.challenges;

import java.util.Map;

public interface InformationService {
    void inform(Buyer buyer, Map<Product, Integer> products);
}
