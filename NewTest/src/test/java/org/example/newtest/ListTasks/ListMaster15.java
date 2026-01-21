package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster15 {
    List<Integer> getListWithNumberFromOneToFiveHundredNinty() {
        return IntStream.rangeClosed(1, 590).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredTwenty() {
        return IntStream.rangeClosed(1, 820).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTwoHundred() {
        return IntStream.rangeClosed(1, 200).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundred() {
        return IntStream.rangeClosed(1, 700).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneThousand() {
        return IntStream.rangeClosed(1, 1000).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOenToOneThousandTest() {
        System.out.println(getListWithNumberFromOneToOneThousand());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTest() {
        System.out.println(getListWithNumberFromOneToSevenHundred());
    }

    @Test
    public void getListWithNumberFromOneToTwoHundredTest() {
        System.out.println(getListWithNumberFromOneToTwoHundred());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredNinty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 590
ВЕРНИ СПИСОК ОТ 1 ДО 820
ВЕРНИ СПИСОК ОТ 1 ДО 200
ВЕРНИ СПИСОК ОТ 1 ДО 700
ВЕРНИ СПИСОК ОТ 1 ДО 1000
*/