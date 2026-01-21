package org.example.newtest.CodeRetreat.LordOfTheRings;

import java.util.*;

public class LordOfTheRings {
    public static void main(String[] args) {
        Set<RingBearer> fellowship = new HashSet<>();
        fellowship.add(new Frodo());
        fellowship.add(new Sauron());

        System.out.println("""
                ╔══════════════════════════════════════════╗
                ║      ВЛАСТЕЛИН КОЛЕЦ: ОДНО КОЛЬЦО        ║
                ║   "One Ring to rule them all..."         ║
                ╚══════════════════════════════════════════╝
                """);
        RingBearer frodo = fellowship.stream()
                .filter(b -> b.getName().contains("Фродо"))
                .findFirst().get();
        RingBearer sauron = fellowship.stream()
                .filter(b -> b.getName().contains("Саурон"))
                .findFirst().get();

        frodo.speak();

        try {
            frodo.putOnRing();
            sauron.putOnRing();
        } catch (RingTakenException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("\nТекущий носитель: " + OneRing.getBearer());
        System.out.println("Все в Братстве: " + fellowship);

        System.out.println("\nФродо подходит к жерлу Роковой горы...");

        if (OneRing.getBearer() == frodo) {
            System.out.println("Фродо Бэггинс бросает Кольцо в огонь!");
            OneRing.destroy(); // теперь просто очищает
            System.out.println("THE RING IS DESTROYED!");
            System.out.println("THE RING IS DESTROYED! MORDOR FALLS!");
        } else {
            System.out.println("Голлум вырывает Кольцо из рук " + OneRing.getBearer().getName() + "...");
            System.out.println("...и падает в жерло вместе с Кольцом!");
            OneRing.getBearer().hasRing = false;
            OneRing.take(null);
            System.out.println("THE RING IS DESTROYED!");
            System.out.println("THE RING IS DESTROYED! MORDOR FALLS!");
        }
        System.out.println("\n[SUCCESS] Средиземье спасено!");
    }
}