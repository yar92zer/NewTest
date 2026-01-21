package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster14 {
    List<Integer> getListWithNumberFromOneToEightHundredFifty() {
        return IntStream.rangeClosed(1, 850).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToForeHundredForty() {
        return IntStream.rangeClosed(1, 440).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneThousand() {
        return IntStream.rangeClosed(1, 1000).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToFiveHundredNinty() {
        return IntStream.rangeClosed(1, 590).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundred() {
        return IntStream.rangeClosed(1, 200).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToTowHundredTest() {
        System.out.println(getListWithNumberFromOneToTowHundred());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredNintyTest() {
        System.out.println(getListWithNumberFormOneToFiveHundredNinty());
    }

    @Test
    public void getListWithNumberFromOneToOneThousandTest() {
        System.out.println(getListWithNumberFromOneToOneThousand());
    }

    @Test
    public void getListWithNumberFromOneToForeHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToForeHundredForty());
    }

    @Test
    public void getListWithNumberFormOneToEightHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredFifty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 850
ВЕРНИ СПИСОК ОТ 1 ДО 440
ВЕРНИ СПИСОК ОТ 1 ДО 1000
ВЕРНИ СПИСОК ОТ 1 ДО 590
ВЕРНИ СПИСОК ОТ 1 ДО 200*/