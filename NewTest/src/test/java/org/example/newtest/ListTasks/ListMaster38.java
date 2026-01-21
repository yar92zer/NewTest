package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster38 {
    List<Integer> getListWithNumberFromOneToOneHundredTwenty() {
        return IntStream.rangeClosed(1, 120).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredSixty() {
        return IntStream.rangeClosed(1, 560).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredTwenty() {
        return IntStream.rangeClosed(1, 820).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredSixty() {
        return IntStream.rangeClosed(1, 170).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredTwenty() {
        return IntStream.rangeClosed(1, 420).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFourHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneEightHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 120
ВЕРНИ СПИСОК ОТ 1 ДО 560
ВЕРНИ СПИСОК ОТ 1 ДО 820
ВЕРНИ СПИСОК ОТ 1 ДО 170
ВЕРНИ СПИСОК ОТ 1 ДО 420*/