package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPING TASK";
    public static final String PAINTINGTASK = "PAINTING TASK";
    public static final String DRIVINGTASK = "DRIVING TASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("To go to Castorama", "White paint", 3);
            case PAINTINGTASK:
                return new PaintingTask("Painting task nr 1", "White", "Door");
            case DRIVINGTASK:
                return new DrivingTask("To pick up a client", "Airport", "Mercedes");
            default:
                return null;
        }
    }
}
