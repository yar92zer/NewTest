package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster21 {
    List<Integer> getListWithNumberFromOneToFiveHundredSixty() {
        return IntStream.rangeClosed(1, 560).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredEighty() {
        return IntStream.rangeClosed(1, 680).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredTen() {
        return IntStream.rangeClosed(1, 510).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredForty() {
        return IntStream.rangeClosed(1, 540).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSeventy() {
        return IntStream.rangeClosed(1, 70).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOntToSeventyTest() {
        System.out.println(getListWithNumberFromOneToSeventy());
    }

    @Test
    public void getListWithNumberFormOneToFiveHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredForty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTenTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredSixty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 560
ВЕРНИ СПИСОК ОТ 1 ДО 680
ВЕРНИ СПИСОК ОТ 1 ДО 510
ВЕРНИ СПИСОК ОТ 1 ДО 540
ВЕРНИ СПИСОК ОТ 1 ДО 70*/