package org.example.newtest.CodeRetreat.OrderSystem;

class Order {
    private String customer;
    private double amount;
    private boolean paid = false;
    private static int total = 0;

    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
        total++;
    }

    public void pay() {
        paid = true;
    }

    public String getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return customer + ": $" + String.format("%.2f", amount) + (paid ? " [ОПЛАЧЕНО]" : " [НЕ ОПЛАЧЕНО]");
    }
}