package com.kodilla.foodShopPractice;

public class ProductDto {
    String name;
    double price;
    Supplier supplier;

    public ProductDto(String name, double price, Supplier supplier) {
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
