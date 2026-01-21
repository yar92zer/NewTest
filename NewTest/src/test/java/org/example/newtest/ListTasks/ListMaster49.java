package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster49 {
    List<Integer> getListWithNumberFromOneToOneHundredNinty() {
        return IntStream.rangeClosed(1, 190).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredTwenty() {
        return IntStream.rangeClosed(1, 520).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundred() {
        return IntStream.rangeClosed(1, 600).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredSixty() {
        return IntStream.rangeClosed(1, 560).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredThirty() {
        return IntStream.rangeClosed(1, 130).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToOneHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTest() {
        System.out.println(getListWithNumberFromOneToSixHundred());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredNinty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 190
ВЕРНИ СПИСОК ОТ 1 ДО 520
ВЕРНИ СПИСОК ОТ 1 ДО 600
ВЕРНИ СПИСОК ОТ 1 ДО 560
ВЕРНИ СПИСОК ОТ 1 ДО 130*/