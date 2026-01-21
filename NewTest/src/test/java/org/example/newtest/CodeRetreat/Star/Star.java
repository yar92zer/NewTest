package org.example.newtest.CodeRetreat.Star;

import java.util.*;
public class Star {
    public static void main(String []args){
        List<StarWars> galaxy = new ArrayList<>();
        Set<String> uniqueNames= new HashSet<>();

        StarMap map1 = new StarMap("Tatooine", 5000);
        StarMap map2 = new StarMap("Coruscant", 25000);

        StarMaps s1 = new StarMaps("Death Star");
        StarMaps s2 = new StarMaps("Millennium Falcon");

        galaxy.add(s1);
        galaxy.add(s2);

        uniqueNames.add(s1.name);
        uniqueNames.add(s2.name);

        System.out.println("╔════════════════════╗");
        System.out.println("║     STAR SYSTEM    ║");
        System.out.println("╚════════════════════╝");

        galaxy.forEach(StarWars::timeStar);

        System.out.println("\n[INFO] Всего карт: "+ StarMap.getTotal());
        System.out.println("[INFO] Уникальные объекты: "+uniqueNames);
        System.out.println("[SUCCESS] Галактика загружена.");

    }
}