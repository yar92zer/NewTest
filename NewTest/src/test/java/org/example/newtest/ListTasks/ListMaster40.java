package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster40 {
    List<Integer> getListWithNumberFromOneToSevenHundredTwenty() {
        return IntStream.rangeClosed(1, 720).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredFifty() {
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredSixty() {
        return IntStream.rangeClosed(1, 260).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredNinety() {
        return IntStream.rangeClosed(1, 790).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredFourty() {
        return IntStream.rangeClosed(1, 840).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToEightHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 720
ВЕРНИ СПИСОК ОТ 1 ДО 150
ВЕРНИ СПИСОК ОТ 1 ДО 260
ВЕРНИ СПИСОК ОТ 1 ДО 790
ВЕРНИ СПИСОК ОТ 1 ДО 840*/