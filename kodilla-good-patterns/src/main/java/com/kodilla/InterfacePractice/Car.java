package com.kodilla.InterfacePractice;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the engine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the engine...");
    }
}
