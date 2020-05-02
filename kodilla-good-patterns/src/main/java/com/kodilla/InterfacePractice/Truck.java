package com.kodilla.InterfacePractice;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the truck's engine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the truck's engine...");

    }
}
