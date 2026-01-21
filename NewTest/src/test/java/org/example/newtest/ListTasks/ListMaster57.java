package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster57 {
    List<Integer> getListWithNumberFromOneToOneHundredFourty() {
        return IntStream.rangeClosed(1, 140).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredFifty() {
        return IntStream.rangeClosed(1, 650).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredTwenty() {
        return IntStream.rangeClosed(1, 320).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredEighty() {
        return IntStream.rangeClosed(1, 880).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredTwenty() {
        return IntStream.rangeClosed(1, 420).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFourHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredEightTest() {
        System.out.println(getListWithNumberFromOneToEightHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFourty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 140
ВЕРНИ СПИСОК ОТ 1 ДО 650
ВЕРНИ СПИСОК ОТ 1 ДО 320
ВЕРНИ СПИСОК ОТ 1 ДО 880
ВЕРНИ СПИСОК ОТ 1 ДО 420*/