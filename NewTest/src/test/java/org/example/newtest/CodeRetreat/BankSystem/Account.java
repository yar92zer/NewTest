package org.example.newtest.CodeRetreat.BankSystem;

class Account {
    private String owner;
    private double balance;
    private static int total = 0;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        total++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance = amount;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return owner + ": $" + String.format("%.2f", balance);
    }
}