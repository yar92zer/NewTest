package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster59 {
    List<Integer> getListWithNumberFromOneToSixHundredFifty() {
        return IntStream.rangeClosed(1, 650).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredNinety() {
        return IntStream.rangeClosed(1, 590).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredFourty() {
        return IntStream.rangeClosed(1, 140).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTen() {
        return IntStream.rangeClosed(1, 710).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTenTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredFifty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 650
ВЕРНИ СПИСОК ОТ 1 ДО 620
ВЕРНИ СПИСОК ОТ 1 ДО 590
ВЕРНИ СПИСОК ОТ 1 ДО 140
ВЕРНИ СПИСОК ОТ 1 ДО 710*/