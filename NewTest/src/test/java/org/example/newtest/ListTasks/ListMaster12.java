package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster12 {
    List<Integer> getListWithNumberFromOneToEightHundredTen() {
        return IntStream.rangeClosed(1, 810).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredEighteen() {
        return IntStream.rangeClosed(1, 880).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToFourHundredNinety() {
        return IntStream.rangeClosed(1, 490).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToSixHundredThirty() {
        return IntStream.rangeClosed(1, 630).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredTwenty() {
        return IntStream.rangeClosed(1, 720).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredThirtyTest() {
        System.out.println(getListWithNumberFormOneToSixHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredNinetyTest() {
        System.out.println(getListWithNumberFormOneToFourHundredNinety());
    }

    @Test
    public void getListWithNumberFormOneToEightHundredEighteenTest() {
        System.out.println(getListWithNumberFromOneToEightHundredEighteen());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredTenTest() {
        System.out.println(getListWithNumberFromOneToEightHundredTen());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 810
ВЕРНИ СПИСОК ОТ 1 ДО 880
ВЕРНИ СПИСОК ОТ 1 ДО 490
ВЕРНИ СПИСОК ОТ 1 ДО 630
ВЕРНИ СПИСОК ОТ 1 ДО 720
*/