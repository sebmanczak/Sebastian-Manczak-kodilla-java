package com.kodilla.good.patterns.challenges;
        import java.util.HashMap;
        import java.util.Map;

public class PurchaseRequest {
    private Map<Product, Integer> products = new HashMap<>();
    private Buyer buyer;

    public void add(Product product, Integer count) {
        products.put(product, count);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "";
    }
}
