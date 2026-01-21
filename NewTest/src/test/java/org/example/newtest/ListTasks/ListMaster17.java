package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster17 {
    List<Integer> getListWithNumberFromOneToNineHundred() {
        return IntStream.rangeClosed(1, 900).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredSeventy() {
        return IntStream.rangeClosed(1, 570).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredThirty() {
        return IntStream.rangeClosed(1, 130).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredFifty() {
        return IntStream.rangeClosed(1, 350).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTest() {
        System.out.println(getListWithNumberFromOneToNineHundred());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 900
ВЕРНИ СПИСОК ОТ 1 ДО 570
ВЕРНИ СПИСОК ОТ 1 ДО 620
ВЕРНИ СПИСОК ОТ 1 ДО 130
ВЕРНИ СПИСОК ОТ 1 ДО 350*/