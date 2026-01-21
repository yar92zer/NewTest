package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster43 {
    List<Integer> getListWithNumberFromOneToOneHundredFourty() {
        return IntStream.rangeClosed(1, 140).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredEighty() {
        return IntStream.rangeClosed(1, 780).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredEighty() {
        return IntStream.rangeClosed(1, 580).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredTwenty() {
        return IntStream.rangeClosed(1, 520).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredTen() {
        return IntStream.rangeClosed(1, 710).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTenTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFourty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 140
ВЕРНИ СПИСОК ОТ 1 ДО 780
ВЕРНИ СПИСОК ОТ 1 ДО 580
ВЕРНИ СПИСОК ОТ 1 ДО 520
ВЕРНИ СПИСОК ОТ 1 ДО 710*/