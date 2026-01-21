package org.example.newtest.ListTasks;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster30 {
    List<Integer> getListWithNumberFromOneToForeHundredSixty() {
        return IntStream.rangeClosed(1, 460).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToThirty() {
        return IntStream.rangeClosed(1, 30).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToOneHundredFifty() {
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredForty() {
        return IntStream.rangeClosed(1, 940).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToOneHundredEighty() {
        return IntStream.rangeClosed(1, 180).boxed().toList();
    }

    @Test
    public void getListWithNumberFormOneToOneHundredEightyTest() {
        System.out.println(getListWithNumberFormOneToOneHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredForty());
    }

    @Test
    public void getListWithNumberFormOneToOneHundredFiftyTest() {
        System.out.println(getListWithNumberFormOneToOneHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToThirtyTest() {
        System.out.println(getListWithNumberFormOneToThirty());
    }

    @Test
    public void getListWithNumberFormOneToForeHundredSixty() {
        System.out.println(getListWithNumberFromOneToForeHundredSixty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 460
ВЕРНИ СПИСОК ОТ 1 ДО 30
ВЕРНИ СПИСОК ОТ 1 ДО 150
ВЕРНИ СПИСОК ОТ 1 ДО 940
ВЕРНИ СПИСОК ОТ 1 ДО 180*/