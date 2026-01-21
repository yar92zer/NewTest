package org.example.newtest.CodeRetreat.BankSystem;

class CorporateBanking extends Department {
    public CorporateBanking() {
        super("Корпоративный банкинг");
    }

    @Override
    public void report() {
        System.out.println(">>> " + name + " <<<");
        accounts.forEach(a -> System.out.println("  [КОРП] " + a));
    }

    public void add(Account a) {
        accounts.add(a);
    }
}