package org.example.newtest.CodeRetreat.Bank;

class SavingsAccount extends Account {
    private double interestRate = 0.03;

    public SavingsAccount(String number, double initial) {
        super(number, initial);
    }

    public void addInterest() {
        balance += balance * interestRate;
    }

    @Override
    public String toString() {
        return "Savings " + super.toString() + " (+" + (interestRate * 100) + "%0";
    }
}