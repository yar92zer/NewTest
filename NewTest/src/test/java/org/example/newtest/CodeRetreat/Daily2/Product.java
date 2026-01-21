package org.example.newtest.CodeRetreat.Daily2;

class Product {
    protected String name;
    protected double price;
    private static int totalProducts = 0;

    public Product(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price < 0) {
            throw new IllegalStateException("Price cannot be negative");
        }
        this.name = name.trim();
        this.price = price;
        totalProducts++;
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public double getFinalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price:" + getFinalPrice();
    }
}