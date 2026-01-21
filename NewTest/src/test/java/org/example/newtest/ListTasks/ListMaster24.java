package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster24 {
    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredFifty() {
        return IntStream.rangeClosed(1, 350).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundred() {
        return IntStream.rangeClosed(1, 200).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredThirty() {
        return IntStream.rangeClosed(1, 630).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEithHundredTwenty() {
        return IntStream.rangeClosed(1, 820).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToEithHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToEithHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredTest() {
        System.out.println(getListWithNumberFromOneToTowHundred());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 620
ВЕРНИ СПИСОК ОТ 1 ДО 350
ВЕРНИ СПИСОК ОТ 1 ДО 200
ВЕРНИ СПИСОК ОТ 1 ДО 630
ВЕРНИ СПИСОК ОТ 1 ДО 820*/