package com.kodilla.foodShopPractice;

public class Door2DoorMain {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        ProductDto product1 = new ProductDto("Loin of Pork", 3.55, extraFoodShop);
        ProductDto product2 = new ProductDto("Breast of Chicken", 1.44, healthyShop);
        ProductDto product3 = new ProductDto("1 kg of Carrots", 0.89, glutenFreeShop);

        OrderDto order = new OrderDto();
        System.out.println();
        order.add(product1, 10);

        order.add(product2, 8);

        order.add(product3, 20);

        orderProcessor.processOrder(order);
    }
}
