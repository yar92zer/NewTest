package org.example.newtest.ListTasks;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster27 {
    List<Integer> getListWithNumberFromOneToThreeHundredSixty() {
        return IntStream.rangeClosed(1, 360).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSeventy() {
        return IntStream.rangeClosed(1, 770).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredThirty() {
        return IntStream.rangeClosed(1, 830).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToNineHundredThirty() {
        return IntStream.rangeClosed(1, 930).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredForty() {
        return IntStream.rangeClosed(1, 740).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredForty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredThirtyTest() {
        System.out.println(getListWithNumberFormOneToNineHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredSixty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 360
ВЕРНИ СПИСОК ОТ 1 ДО 770
ВЕРНИ СПИСОК ОТ 1 ДО 830
ВЕРНИ СПИСОК ОТ 1 ДО 930
ВЕРНИ СПИСОК ОТ 1 ДО 740*/