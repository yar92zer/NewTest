package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster61 {
    List<Integer> getListWithNumberFromOneToOneHundredTwenty() {
        return IntStream.rangeClosed(1, 120).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredSeventy() {
        return IntStream.rangeClosed(1, 570).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredThirty() {
        return IntStream.rangeClosed(1, 530).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredTen() {
        return IntStream.rangeClosed(1, 810).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredEight() {
        return IntStream.rangeClosed(1, 580).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredEightTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredEight());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredTenTest() {
        System.out.println(getListWithNumberFromOneToEightHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 120
ВЕРНИ СПИСОК ОТ 1 ДО 570
ВЕРНИ СПИСОК ОТ 1 ДО 530
ВЕРНИ СПИСОК ОТ 1 ДО 810
ВЕРНИ СПИСОК ОТ 1 ДО 580
*/