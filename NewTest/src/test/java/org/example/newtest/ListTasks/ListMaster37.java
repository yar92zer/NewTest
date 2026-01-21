package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster37 {
    List<Integer> getListWithNumberFromOneToEightHundredSixty() {
        return IntStream.rangeClosed(1, 860).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundred() {
        return IntStream.rangeClosed(1, 300).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredNinety() {
        return IntStream.rangeClosed(1, 990).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundred() {
        return IntStream.rangeClosed(1, 100).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredFourty() {
        return IntStream.rangeClosed(1, 640).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTest() {
        System.out.println(getListWithNumberFromOneToOneHundred());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTest() {
        System.out.println(getListWithNumberFromOneToThreeHundred());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredSixty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 860
ВЕРНИ СПИСОК ОТ 1 ДО 300
ВЕРНИ СПИСОК ОТ 1 ДО 990
ВЕРНИ СПИСОК ОТ 1 ДО 100
ВЕРНИ СПИСОК ОТ 1 ДО 640*/