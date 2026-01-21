package org.example.newtest.ListTasks;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster31 {
    List<Integer> getListWithNumberFromOneToFiveHundredSeventy() {
        return IntStream.rangeClosed(1, 570).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredTen() {
        return IntStream.rangeClosed(1, 410).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundred() {
        return IntStream.rangeClosed(1, 300).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredEighty() {
        return IntStream.rangeClosed(1, 680).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredTwenty() {
        return IntStream.rangeClosed(1, 520).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTest() {
        System.out.println(getListWithNumberFromOneToThreeHundred());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredTenTest() {
        System.out.println(getListWithNumberFromOneToFourHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredSeventy());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 570
ВЕРНИ СПИСОК ОТ 1 ДО 410
ВЕРНИ СПИСОК ОТ 1 ДО 300
ВЕРНИ СПИСОК ОТ 1 ДО 680
ВЕРНИ СПИСОК ОТ 1 ДО 520*/