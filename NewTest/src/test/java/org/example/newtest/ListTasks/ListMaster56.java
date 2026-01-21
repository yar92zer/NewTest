package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster56 {
    List<Integer> getListWithNumberFromOneToThreeHundredFifty() {
        return IntStream.rangeClosed(1, 350).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredSixty() {
        return IntStream.rangeClosed(1, 360).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundred() {
        return IntStream.rangeClosed(1, 500).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredTwenty() {
        return IntStream.rangeClosed(1, 520).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredEighty() {
        return IntStream.rangeClosed(1, 680).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTest() {
        System.out.println(getListWithNumberFromOneToFiveHundred());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredFifty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 350
ВЕРНИ СПИСОК ОТ 1 ДО 360
ВЕРНИ СПИСОК ОТ 1 ДО 500
ВЕРНИ СПИСОК ОТ 1 ДО 520
ВЕРНИ СПИСОК ОТ 1 ДО 680*/