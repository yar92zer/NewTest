package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster58 {
    List<Integer> getListWithNumberFromOneToOneHundredFifty() {
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredTen() {
        return IntStream.rangeClosed(1, 310).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredSeventy() {
        return IntStream.rangeClosed(1, 870).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredFifty() {
        return IntStream.rangeClosed(1, 550).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredEighty() {
        return IntStream.rangeClosed(1, 880).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToEightHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTenTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFifty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 150
ВЕРНИ СПИСОК ОТ 1 ДО 310
ВЕРНИ СПИСОК ОТ 1 ДО 870
ВЕРНИ СПИСОК ОТ 1 ДО 550
ВЕРНИ СПИСОК ОТ 1 ДО 880*/