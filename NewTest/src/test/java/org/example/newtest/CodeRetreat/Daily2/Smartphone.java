package org.example.newtest.CodeRetreat.Daily2;

class Smartphone extends Electronics {
    private String brand;

    public Smartphone(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Smartphone: " + brand + " " + name + ", Price: " + " " + getFinalPrice() + " (10 % discount) ";
    }
}