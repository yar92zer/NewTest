package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster39 {
    List<Integer> getListWithNumberFromOneToTowHundredFifty() {
        return IntStream.rangeClosed(1, 250).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundred() {
        return IntStream.rangeClosed(1, 900).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundred() {
        return IntStream.rangeClosed(1, 100).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredNinety() {
        return IntStream.rangeClosed(1, 890).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToEightHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTest() {
        System.out.println(getListWithNumberFromOneToOneHundred());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTest() {
        System.out.println(getListWithNumberFromOneToNineHundred());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredFifty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 250
ВЕРНИ СПИСОК ОТ 1 ДО 620
ВЕРНИ СПИСОК ОТ 1 ДО 900
ВЕРНИ СПИСОК ОТ 1 ДО 100
ВЕРНИ СПИСОК ОТ 1 ДО 890*/