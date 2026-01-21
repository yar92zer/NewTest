package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster5 {
    List<Integer> getListWithNumberFormOneToFiveHundredTen() {
        return IntStream.rangeClosed(1, 510).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredTen() {
        return IntStream.rangeClosed(1, 810).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundred() {
        return IntStream.rangeClosed(1, 700).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredFifty() {
        return IntStream.rangeClosed(1, 350).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToFiveHundredFifty(){
        return IntStream.rangeClosed(1, 550).boxed().toList();
    }

    @Test
    public void getListNumberFromOneToFiveHundredFifty(){
        System.out.println(getListWithNumberFromOneToFiveHundredFifty());
    }

    @Test
    public void getListNumberFromOneToThreeHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTest() {
        System.out.println(getListWithNumberFromOneToSevenHundred());
    }

    @Test
    public void getListWithNumberFormOneToEightHundredTenTest() {
        System.out.println(getListWithNumberFromOneToEightHundredTen());
    }

    @Test
    public void getListWithFormOneToFiveHundredTenTest() {
        System.out.println(getListWithNumberFormOneToFiveHundredTen());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 510
ВЕРНИ СПИСОК ОТ 1 ДО 810
ВЕРНИ СПИСОК ОТ 1 ДО 700
ВЕРНИ СПИСОК ОТ 1 ДО 350
ВЕРНИ СПИСОК ОТ 1 ДО 550*/