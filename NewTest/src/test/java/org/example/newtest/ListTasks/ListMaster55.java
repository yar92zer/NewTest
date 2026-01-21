package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster55 {
    List<Integer> getListWithNumberFromOneToFourHundredTwenty() {
        return IntStream.rangeClosed(1, 420).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNinety() {
        return IntStream.rangeClosed(1, 90).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTen() {
        return IntStream.rangeClosed(1, 610).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEighty() {
        return IntStream.rangeClosed(1, 80).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredFourty() {
        return IntStream.rangeClosed(1, 540).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToEightyTest() {
        System.out.println(getListWithNumberFromOneToEighty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTenTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToNinetyTest() {
        System.out.println(getListWithNumberFromOneToNinety());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 420
ВЕРНИ СПИСОК ОТ 1 ДО 90
ВЕРНИ СПИСОК ОТ 1 ДО 610
ВЕРНИ СПИСОК ОТ 1 ДО 80
ВЕРНИ СПИСОК ОТ 1 ДО 540*/