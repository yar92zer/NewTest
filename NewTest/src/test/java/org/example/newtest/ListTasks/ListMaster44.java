package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster44 {
    List<Integer> getListWithNumberFromOneToTowHundredThirty() {
        return IntStream.rangeClosed(1, 230).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredTwenty() {
        return IntStream.rangeClosed(1, 930).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixty() {
        return IntStream.rangeClosed(1, 60).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredThirty() {
        return IntStream.rangeClosed(1, 530).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredTen() {
        return IntStream.rangeClosed(1, 710).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTenTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSixtyTest() {
        System.out.println(getListWithNumberFromOneToSixty());
    }

    @Test
    public void getListWithNumberFromOneToNienHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredThirty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 230
ВЕРНИ СПИСОК ОТ 1 ДО 920
ВЕРНИ СПИСОК ОТ 1 ДО 60
ВЕРНИ СПИСОК ОТ 1 ДО 530
ВЕРНИ СПИСОК ОТ 1 ДО 710
*/