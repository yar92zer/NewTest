package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster7 {
    List<Integer> getListWithNumberFormOneToSixHundredEighty() {
        return IntStream.rangeClosed(1, 680).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTwoHundredFourty() {
        return IntStream.rangeClosed(1, 240).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTwoHundredNinty() {
        return IntStream.rangeClosed(1, 290).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredFourty() {
        return IntStream.rangeClosed(1, 440).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredThirty() {
        return IntStream.rangeClosed(1, 430).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFourHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToTwoHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToTwoHundredNinty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToTwoHundredFourty());
    }

    @Test
    public void getListListWithNumberFromOneToSixHundredEightyTest() {
        System.out.println(getListWithNumberFormOneToSixHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 680
ВЕРНИ СПИСОК ОТ 1 ДО 240
ВЕРНИ СПИСОК ОТ 1 ДО 290
ВЕРНИ СПИСОК ОТ 1 ДО 440
ВЕРНИ СПИСОК ОТ 1 ДО 430*/