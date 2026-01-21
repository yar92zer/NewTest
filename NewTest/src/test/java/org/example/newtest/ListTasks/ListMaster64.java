package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster64 {
    List<Integer> getListWithNumberFromOneToEightHundredTen() {
        return IntStream.rangeClosed(1, 810).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredFourty() {
        return IntStream.rangeClosed(1, 540).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredFourty() {
        return IntStream.rangeClosed(1, 940).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTen() {
        return IntStream.rangeClosed(1, 10).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredEighty() {
        return IntStream.rangeClosed(1, 180).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToOneHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToTenTest() {
        System.out.println(getListWithNumberFromOneToTen());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredFourty());
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
ВЕРНИ СПИСОК ОТ 1 ДО 940
ВЕРНИ СПИСОК ОТ 1 ДО 10
ВЕРНИ СПИСОК ОТ 1 ДО 180*/