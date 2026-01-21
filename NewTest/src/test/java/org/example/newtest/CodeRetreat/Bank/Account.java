package org.example.newtest.CodeRetreat.Bank;

class Account {
    protected String number;
    protected double balance;
    private static int totalAccounts = 0;

    public Account(String number, double initial) {
        if (number == null || number.isEmpty()) throw new IllegalArgumentException("Number empty");
        if (initial < 0) throw new IllegalStateException("Negative deposit");

        this.number = number;
        this.balance = initial;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount <=0");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalStateException("Insufficient funds");
        balance -= amount;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public String toString() {
        return number + ": $" + balance;
    }
}