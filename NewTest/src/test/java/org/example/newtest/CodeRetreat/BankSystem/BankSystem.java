package org.example.newtest.CodeRetreat.BankSystem;

import java.util.*;

public class BankSystem {
    public static void main(String[] args) {
        Map<String, Department> bank = new LinkedHashMap<>();
        Set<String> uniqueOwners = new HashSet<>();

        Account a1 = new Account("Иван", 1500.75);
        Account a2 = new Account("ООО Рога и Копыта", 50000.00);

        RetailBanking retail = new RetailBanking();
        CorporateBanking corporate = new CorporateBanking();

        retail.add(a1);
        corporate.add(a2);

        a1.deposit(200);
        a2.withdraw(1000);

        Department d1 = retail;
        Department d2 = corporate;

        bank.put("Розница", retail);
        bank.put("Корпоратив", corporate);

        uniqueOwners.add(a1.getOwner().split(" ")[0]);
        uniqueOwners.add(a2.getOwner().split(" ")[0]);

        System.out.println("=== БАНКОВСКАЯ СИСТЕМА ===");
        bank.values().forEach(Department::report);

        System.out.println("\nУникальные клиенты: " + uniqueOwners);
        System.out.println("Всего счетов: " + Account.getTotal());
    }
}