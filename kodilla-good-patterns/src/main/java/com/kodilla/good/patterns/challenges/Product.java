package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;
    private int productNumber;

    public Product(String productName, int productNumber) {
        this.productName = productName;
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Product: " +
                productName +
                ", productNumber: " + productNumber + ", Quantity: ";
    }
}
