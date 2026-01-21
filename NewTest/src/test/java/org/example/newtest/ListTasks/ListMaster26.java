package org.example.newtest.ListTasks;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster26 {
    List<Integer> getListWithNumberFromOneToFiveHundred() {
        return IntStream.rangeClosed(1, 500).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredNinety() {
        return IntStream.rangeClosed(1, 390).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredFourty() {
        return IntStream.rangeClosed(1, 140).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTen() {
        return IntStream.rangeClosed(1, 10).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredFourty() {
        return IntStream.rangeClosed(1, 840).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToEightHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToTenTest() {
        System.out.println(getListWithNumberFromOneToTen());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredNinety());
    }

    @Test
    public void getListWithNumberFormOneToFiveTest() {
        System.out.println(getListWithNumberFromOneToFiveHundred());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 500
ВЕРНИ СПИСОК ОТ 1 ДО 390
ВЕРНИ СПИСОК ОТ 1 ДО 140
ВЕРНИ СПИСОК ОТ 1 ДО 10
ВЕРНИ СПИСОК ОТ 1 ДО 840*/