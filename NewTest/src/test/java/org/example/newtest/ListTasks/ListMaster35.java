package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster35 {
    List<Integer> getListWithNumberFromOneToSvenHundredSeventy() {
        return IntStream.rangeClosed(1, 770).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredFourty() {
        return IntStream.rangeClosed(1, 840).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNinety() {
        return IntStream.rangeClosed(1, 90).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredSixty() {
        return IntStream.rangeClosed(1, 460).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredFourty() {
        return IntStream.rangeClosed(1, 240).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToTowHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToNinetyTest() {
        System.out.println(getListWithNumberFromOneToNinety());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToSvenHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSvenHundredSeventy());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 770
ВЕРНИ СПИСОК ОТ 1 ДО 840
ВЕРНИ СПИСОК ОТ 1 ДО 90
ВЕРНИ СПИСОК ОТ 1 ДО 460
ВЕРНИ СПИСОК ОТ 1 ДО 240*/