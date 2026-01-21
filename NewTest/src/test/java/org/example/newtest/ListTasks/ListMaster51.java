package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster51 {
    List<Integer> getListWithNumberFromOneToFourHundredTwenty() {
        return IntStream.rangeClosed(1, 420).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredSeventy() {
        return IntStream.rangeClosed(1, 670).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredEighty() {
        return IntStream.rangeClosed(1, 180).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredEighty() {
        return IntStream.rangeClosed(1, 880).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredFourty() {
        return IntStream.rangeClosed(1, 240).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToTowHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 420
ВЕРНИ СПИСОК ОТ 1 ДО 670
ВЕРНИ СПИСОК ОТ 1 ДО 180
ВЕРНИ СПИСОК ОТ 1 ДО 880
ВЕРНИ СПИСОК ОТ 1 ДО 240*/