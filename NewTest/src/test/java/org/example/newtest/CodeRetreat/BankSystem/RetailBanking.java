package org.example.newtest.CodeRetreat.BankSystem;

class RetailBanking extends Department {
    public RetailBanking() {
        super("Розничный банкинг");
    }

    @Override
    public void report() {
        System.out.println("=== " + name + " ===");
        accounts.forEach(a -> System.out.println(" " + a));
    }

    public void add(Account a) {
        accounts.add(a);
    }
}