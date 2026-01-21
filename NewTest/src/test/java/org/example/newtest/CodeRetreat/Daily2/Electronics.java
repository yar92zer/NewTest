package org.example.newtest.CodeRetreat.Daily2;

class Electronics extends Product {
    public Electronics(String name, double priece) {
        super(name, priece);
    }

    @Override
    public double getFinalPrice() {
        return price * 0.9;
    }

    @Override
    public String toString() {
        return "Electronics: " + name + ", Price: " + getFinalPrice() + "(10% discount)";
    }
}