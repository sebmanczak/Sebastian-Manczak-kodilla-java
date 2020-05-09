package com.kodilla.good.patterns.challenges;

public class PurchaseSummary {
    private Buyer buyer;
    private boolean isPurchased;

    public PurchaseSummary(Buyer buyer, boolean isPurchased) {
        this.buyer = buyer;
        this.isPurchased = isPurchased;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
