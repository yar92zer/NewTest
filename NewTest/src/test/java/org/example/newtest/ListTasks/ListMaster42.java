package org.example.newtest.ListTasks;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster42 {
    List<Integer> getListWithNumberFromOneToThreeHundredEighty() {
        return IntStream.rangeClosed(1, 380).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredNinety() {
        return IntStream.rangeClosed(1, 690).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredTwenty() {
        return IntStream.rangeClosed(1, 320).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixty() {
        return IntStream.rangeClosed(1, 60).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredThirty() {
        return IntStream.rangeClosed(1, 320).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToTowHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSixtyTest() {
        System.out.println(getListWithNumberFromOneToSixty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 380
ВЕРНИ СПИСОК ОТ 1 ДО 690
ВЕРНИ СПИСОК ОТ 1 ДО 320
ВЕРНИ СПИСОК ОТ 1 ДО 60
ВЕРНИ СПИСОК ОТ 1 ДО 230*/