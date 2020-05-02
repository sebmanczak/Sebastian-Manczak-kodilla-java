package com.kodilla.InterfacePractice;

public interface Vehicle {
    public String licencePlate = "";
    //public float maxVel
    public void start();
    public void stop();
    default void blowHorn() {
        System.out.println("Blowing horn");
    }
}
