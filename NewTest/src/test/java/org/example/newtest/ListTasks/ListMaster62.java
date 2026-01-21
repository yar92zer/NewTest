package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster62 {
    List<Integer> getListWithNumberFromOneToSevenHundredFifty() {
        return IntStream.rangeClosed(1, 750).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredEighty() {
        return IntStream.rangeClosed(1, 380).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredNinty() {
        return IntStream.rangeClosed(1, 790).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredFifty() {
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredSeventy() {
        return IntStream.rangeClosed(1, 470).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFourHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredNinty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredEightTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredFifty());
    }

}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 750
ВЕРНИ СПИСОК ОТ 1 ДО 380
ВЕРНИ СПИСОК ОТ 1 ДО 790
ВЕРНИ СПИСОК ОТ 1 ДО 150
ВЕРНИ СПИСОК ОТ 1 ДО 470*/