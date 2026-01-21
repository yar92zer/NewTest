package org.example.newtest.CodeRetreat.CityTransport;

class Vehicle {
    private String model;
    private int capacity;
    private boolean isMoving = false;
    private static int totalVehicles = 0;

    public Vehicle(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        totalVehicles++;
    }

    public void start() {
        isMoving = true;
    }

    public void stop() {
        isMoving = false;
    }

    public String getModel() {
        return model;
    }

    public static int getTotal() {
        return totalVehicles;
    }

    @Override
    public String toString() {
        return model + " [Вместимость: " + capacity + "]" + (isMoving ? " [едет]" : " [стоит]");
    }
}