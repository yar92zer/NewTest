package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster34 {
    List<Integer> getListWithNumberFromOneToNinety() {
        return IntStream.rangeClosed(1, 90).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredThirty() {
        return IntStream.rangeClosed(1, 730).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToForty() {
        return IntStream.rangeClosed(1, 40).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredFifty() {
        return IntStream.rangeClosed(1, 550).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThirty() {
        return IntStream.rangeClosed(1, 30).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToThirtyTest() {
        System.out.println(getListWithNumberFromOneToThirty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToFortyTest() {
        System.out.println(getListWithNumberFromOneToForty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToNinetyTest() {
        System.out.println(getListWithNumberFromOneToNinety());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 90
ВЕРНИ СПИСОК ОТ 1 ДО 730
ВЕРНИ СПИСОК ОТ 1 ДО 40
ВЕРНИ СПИСОК ОТ 1 ДО 550
ВЕРНИ СПИСОК ОТ 1 ДО 30*/