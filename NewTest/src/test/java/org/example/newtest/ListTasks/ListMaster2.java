package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster2 {
    List<Integer> getListWithNumberFromOneToTowHundredFifty() {
        return IntStream.rangeClosed(1, 250).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSixty() {
        return IntStream.rangeClosed(1, 760).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredSeventy() {
        return IntStream.rangeClosed(1, 870).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredFifty() {
        return IntStream.rangeClosed(1, 350).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredThirty(){
        return IntStream.rangeClosed(1, 830).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToEightHundredThirtyTest(){
        System.out.println(getListWithNumberFromOneToEightHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredFifty());

    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 250
ВЕРНИ СПИСОК ОТ 1 ДО 760
ВЕРНИ СПИСОК ОТ 1 ДО 870
ВЕРНИ СПИСОК ОТ 1 ДО 350
ВЕРНИ СПИСОК ОТ 1 ДО 830*/