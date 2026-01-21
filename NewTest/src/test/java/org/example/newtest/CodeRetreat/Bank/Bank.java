package org.example.newtest.CodeRetreat.Bank;

import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Map<String, List<Account>> clients = new HashMap<>();
        Set<String> uniqueNumbers = new HashSet<>();

        try {
            SavingsAccount a1 = new SavingsAccount("SAV001", 1000);
            Account a2 = new Account("CHK002", 500);

            a1.addInterest();
            a2.deposit(200);

            clients.computeIfAbsent("Alice", k -> new ArrayList<>()).add(a1);
            clients.computeIfAbsent("Bob", k -> new ArrayList<>()).add(a2);

            uniqueNumbers.add(a1.number);
            uniqueNumbers.add(a1.number);
            uniqueNumbers.add(a2.number);

            System.out.println("=== БАНК ===");
            clients.forEach((c, accs) -> System.out.println(c + ": " + accs));

            System.out.println("Уникальные номера: " + uniqueNumbers);
            System.out.println("Всего счетов : " + Account.getTotalAccounts());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}