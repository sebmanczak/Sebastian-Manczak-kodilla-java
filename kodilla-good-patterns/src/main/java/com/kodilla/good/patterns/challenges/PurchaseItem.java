package com.kodilla.good.patterns.challenges;

public class PurchaseItem {
    PurchaseRequest purchaseRequest;
    boolean isPurchased;

    public PurchaseItem(PurchaseRequest purchaseRequest, boolean isPurchased) {
        this.purchaseRequest = purchaseRequest;
        this.isPurchased = isPurchased;
    }

    public PurchaseRequest getPurchaseRequest() {
        return purchaseRequest;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
