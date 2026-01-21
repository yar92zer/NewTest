package org.example.newtest.ListTasks;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster28 {
    List<Integer> getListWithNumberFromOneToEightHundredForty() {
        return IntStream.rangeClosed(1, 840).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredEighty() {
        return IntStream.rangeClosed(1, 380).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredNinety() {
        return IntStream.rangeClosed(1, 190).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredEighty() {
        return IntStream.rangeClosed(1, 580).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredTwenty() {
        return IntStream.rangeClosed(1, 120).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredForty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 840
ВЕРНИ СПИСОК ОТ 1 ДО 380
ВЕРНИ СПИСОК ОТ 1 ДО 190
ВЕРНИ СПИСОК ОТ 1 ДО 580
ВЕРНИ СПИСОК ОТ 1 ДО 120
*/