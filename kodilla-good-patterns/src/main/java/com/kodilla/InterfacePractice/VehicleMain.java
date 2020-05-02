package com.kodilla.InterfacePractice;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle tesla = new Car();
        tesla.start();

        Vehicle tata = new Truck();
        tata.start();

        Starter.startEngine(tesla);
        Starter.startEngine(tata);
    }
}
