package org.example.newtest.CodeRetreat.KingTalsa;

import java.util.*;

public class KingTalsa {
    public static void main(String[] args) {
        List<King> empire = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<>();

        Worker w1 = new Worker("Грок", 999);
        Worker w2 = new Worker("Талса", 3000);

        Property k1 = new Property("Король Артас");
        Property k2 = new Property("Король Талса");

        empire.add(k1);
        empire.add(k2);

        uniqueNames.add(k1.name);
        uniqueNames.add(k2.name);

        System.out.println("╔═══════════════════════════╗");
        System.out.println("║     KINGDOM OF TALSA      ║");
        System.out.println("╚═══════════════════════════╝");

        empire.forEach(King::timeKing);

        System.out.println("\n[INFO] Всего работников: " + Worker.getTotal());
        System.out.println("[INFO] Короли Талсы: " + uniqueNames);
        System.out.println("[SUCCESS] Империя возвышается!");
    }
}