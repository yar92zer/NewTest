package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster25 {
    List<Integer> getListWithNumberFromOneToSevenHundredFifty() {
        return IntStream.rangeClosed(1, 750).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredTwenty() {
        return IntStream.rangeClosed(1, 120).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTen() {
        return IntStream.rangeClosed(1, 10).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredEight() {
        return IntStream.rangeClosed(1, 680).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSeventy() {
        return IntStream.rangeClosed(1, 770).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredEightTest() {
        System.out.println(getListWithNumberFromOneToSixHundredEight());
    }

    @Test
    public void getListWithNumberFromOneToTenTest() {
        System.out.println(getListWithNumberFromOneToTen());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredFifty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 750
ВЕРНИ СПИСОК ОТ 1 ДО 120
ВЕРНИ СПИСОК ОТ 1 ДО 10
ВЕРНИ СПИСОК ОТ 1 ДО 680
ВЕРНИ СПИСОК ОТ 1 ДО 770*/