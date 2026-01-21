package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster33 {
    List<Integer> getListWithNumberFromOneToSevenHundredEighty() {
        return IntStream.rangeClosed(1, 780).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredNinety() {
        return IntStream.rangeClosed(1, 690).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredSixty() {
        return IntStream.rangeClosed(1, 460).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToFiveHundred() {
        return IntStream.rangeClosed(1, 500).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredFifty() {
        return IntStream.rangeClosed(1, 650).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTest() {
        System.out.println(getListWithNumberFormOneToFiveHundred());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 780
ВЕРНИ СПИСОК ОТ 1 ДО 690
ВЕРНИ СПИСОК ОТ 1 ДО 460
ВЕРНИ СПИСОК ОТ 1 ДО 500
ВЕРНИ СПИСОК ОТ 1 ДО 650*/