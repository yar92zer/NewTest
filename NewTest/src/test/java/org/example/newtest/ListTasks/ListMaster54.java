package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster54 {
    List<Integer> getListWithNumberFromOneToFiveHundred() {
        return IntStream.rangeClosed(1, 500).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourty() {
        return IntStream.rangeClosed(1, 40).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredNinety() {
        return IntStream.rangeClosed(1, 290).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredNinety() {
        return IntStream.rangeClosed(1, 990).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredSixty() {
        return IntStream.rangeClosed(1, 460).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFourHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToFourtyTest() {
        System.out.println(getListWithNumberFromOneToFourty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTest() {
        System.out.println(getListWithNumberFromOneToFiveHundred());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 500
ВЕРНИ СПИСОК ОТ 1 ДО 40
ВЕРНИ СПИСОК ОТ 1 ДО 290
ВЕРНИ СПИСОК ОТ 1 ДО 990
ВЕРНИ СПИСОК ОТ 1 ДО 460*/