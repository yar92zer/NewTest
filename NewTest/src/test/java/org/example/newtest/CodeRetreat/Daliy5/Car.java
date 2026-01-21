package org.example.newtest.CodeRetreat.Daliy5;

class Car extends Vehicle {
    protected String vin;

    public Car(String model, int price, String vin) {
        super(model, price);
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }
}