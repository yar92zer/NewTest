package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster45 {
    List<Integer> getListWithNumberFromOneToThreeHundredTwenty() {
        return IntStream.rangeClosed(1, 320).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredSeventy() {
        return IntStream.rangeClosed(1, 170).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredNinety() {
        return IntStream.rangeClosed(1, 190).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSeventy() {
        return IntStream.rangeClosed(1, 770).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredFifty() {
        return IntStream.rangeClosed(1, 950).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 320
ВЕРНИ СПИСОК ОТ 1 ДО 170
ВЕРНИ СПИСОК ОТ 1 ДО 190
ВЕРНИ СПИСОК ОТ 1 ДО 770
ВЕРНИ СПИСОК ОТ 1 ДО 950*/