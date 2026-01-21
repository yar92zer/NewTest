package org.example.newtest.CodeRetreat.Daliy5;

class Vehicle {
    protected String model;
    protected int price;
    private static int totalVehicles = 0;

    public Vehicle(String model, int price) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.model = model.trim();
        this.price = price;
        totalVehicles++;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    @Override
    public String toString() {
        return model + " ($" + price + ")";
    }
}