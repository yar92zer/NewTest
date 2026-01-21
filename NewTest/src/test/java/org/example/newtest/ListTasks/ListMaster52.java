package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster52 {
    List<Integer> getListWithNumberFromOneToOneHundredFourty() {
        return IntStream.rangeClosed(1, 140).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredFourty() {
        return IntStream.rangeClosed(1, 540).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneThousand() {
        return IntStream.rangeClosed(1, 1000).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredTen() {
        return IntStream.rangeClosed(1, 410).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredFourty() {
        return IntStream.rangeClosed(1, 240).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToTowHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredTenTest() {
        System.out.println(getListWithNumberFromOneToFourHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToOneThousandTest() {
        System.out.println(getListWithNumberFromOneToOneThousand());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFourty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 140
ВЕРНИ СПИСОК ОТ 1 ДО 540
ВЕРНИ СПИСОК ОТ 1 ДО 1000
ВЕРНИ СПИСОК ОТ 1 ДО 410
ВЕРНИ СПИСОК ОТ 1 ДО 240
*/