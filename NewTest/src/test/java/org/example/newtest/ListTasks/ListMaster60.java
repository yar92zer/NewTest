package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster60 {
    List<Integer> getListWithNumberFromOneToThreeHundredTen() {
        return IntStream.rangeClosed(1, 310).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredNinty() {
        return IntStream.rangeClosed(1, 990).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredSeventy() {
        return IntStream.rangeClosed(1, 870).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourHundredFourty() {
        return IntStream.rangeClosed(1, 440).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredSixty() {
        return IntStream.rangeClosed(1, 660).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredNinty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTenTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredTen());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 310
ВЕРНИ СПИСОК ОТ 1 ДО 990
ВЕРНИ СПИСОК ОТ 1 ДО 870
ВЕРНИ СПИСОК ОТ 1 ДО 440
ВЕРНИ СПИСОК ОТ 1 ДО 660*/