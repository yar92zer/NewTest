package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster48 {
    List<Integer> getListWithNumberFromOneToSevenHundredThirty() {
        return IntStream.rangeClosed(1, 730).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNinety() {
        return IntStream.rangeClosed(1, 90).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourty() {
        return IntStream.rangeClosed(1, 40).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredTwenty() {
        return IntStream.rangeClosed(1, 720).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredSeventy() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFourtyTest() {
        System.out.println(getListWithNumberFromOneToFourty());
    }

    @Test
    public void getListWithNumberFromOneToNinetyTest() {
        System.out.println(getListWithNumberFromOneToNinety());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredThirty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 730
ВЕРНИ СПИСОК ОТ 1 ДО 90
ВЕРНИ СПИСОК ОТ 1 ДО 40
ВЕРНИ СПИСОК ОТ 1 ДО 720
ВЕРНИ СПИСОК ОТ 1 ДО 670*/