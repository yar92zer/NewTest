package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster36 {
    List<Integer> getListWithNumberFromOneToNineHundred() {
        return IntStream.rangeClosed(1, 900).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredThirty() {
        return IntStream.rangeClosed(1, 830).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredEighty() {
        return IntStream.rangeClosed(1, 480).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredNinety() {
        return IntStream.rangeClosed(1, 390).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredEighty() {
        return IntStream.rangeClosed(1, 280).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToTowHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTest() {
        System.out.println(getListWithNumberFromOneToNineHundred());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 900
ВЕРНИ СПИСОК ОТ 1 ДО 830
ВЕРНИ СПИСОК ОТ 1 ДО 480
ВЕРНИ СПИСОК ОТ 1 ДО 390
ВЕРНИ СПИСОК ОТ 1 ДО 280*/