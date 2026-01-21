package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster1 {
    public List<Integer> getListWithNumberFromOneToFourHundredNinety() {
        return IntStream.rangeClosed(1, 490).boxed().toList();
    }

    public List<Integer> getListWithNumberFromOneToSixHundred() {
        return IntStream.rangeClosed(1, 600).boxed().toList();
    }

    public List<Integer> getListWihNumberFromOneToOneHundredTen() {
        return IntStream.rangeClosed(1, 110).boxed().toList();
    }

    public List<Integer> getListWithNumberFromOneToThirty() {
        return IntStream.rangeClosed(1, 30).boxed().toList();
    }

    public List<Integer> getListWithNumberFromOneToTowHundredEighty() {
        return IntStream.rangeClosed(1, 280).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTest() {
        System.out.println(getListWithNumberFromOneToSixHundred());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTenTest() {
        System.out.println(getListWihNumberFromOneToOneHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToThirtyTest() {
        System.out.println(getListWithNumberFromOneToThirty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 490
ВЕРНИ СПИСОК ОТ 1 ДО 600
ВЕРНИ СПИСОК ОТ 1 ДО 110
ВЕРНИ СПИСОК ОТ 1 ДО 30
ВЕРНИ СПИСОК ОТ 1 ДО 280
*/