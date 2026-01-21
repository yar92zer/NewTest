package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster41 {
    List<Integer> getListWithNumberFromOneToEightHundredTen() {
        return IntStream.rangeClosed(1, 810).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredFourty() {
        return IntStream.rangeClosed(1, 540).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredThirty() {
        return IntStream.rangeClosed(1, 830).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneThreeHundredThirty() {
        return IntStream.rangeClosed(1, 330).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredEighty() {
        return IntStream.rangeClosed(1, 980).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneThreeHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredTenTest() {
        System.out.println(getListWithNumberFromOneToEightHundredTen());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 810
ВЕРНИ СПИСОК ОТ 1 ДО 540
ВЕРНИ СПИСОК ОТ 1 ДО 830
ВЕРНИ СПИСОК ОТ 1 ДО 330
ВЕРНИ СПИСОК ОТ 1 ДО 980
*/