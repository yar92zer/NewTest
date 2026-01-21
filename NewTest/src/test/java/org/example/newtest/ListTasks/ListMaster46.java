package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster46 {
    List<Integer> getListWithNumberFromOneToFiveHundredEighty() {
        return IntStream.rangeClosed(1, 580).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredSeventy() {
        return IntStream.rangeClosed(1, 670).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredNinty() {
        return IntStream.rangeClosed(1, 790).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredThirty() {
        return IntStream.rangeClosed(1, 230).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredNinty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 580
ВЕРНИ СПИСОК ОТ 1 ДО 670
ВЕРНИ СПИСОК ОТ 1 ДО 790
ВЕРНИ СПИСОК ОТ 1 ДО 230
ВЕРНИ СПИСОК ОТ 1 ДО 620*/