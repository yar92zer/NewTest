package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster22 {
    List<Integer> getListWithNumberFromOneToTowHundredSeventy() {
        return IntStream.rangeClosed(1, 270).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundred() {
        return IntStream.rangeClosed(1, 300).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredThirteen() {
        return IntStream.rangeClosed(1, 630).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredNinty() {
        return IntStream.rangeClosed(1, 690).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredTen() {
        return IntStream.rangeClosed(1, 910).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTenTest() {
        System.out.println(getListWithNumberFromOneToNineHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredNintyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredNinty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredThirteenTest() {
        System.out.println(getListWithNumberFromOneToSixHundredThirteen());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTest() {
        System.out.println(getListWithNumberFromOneToThreeHundred());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredSeventy());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 270
ВЕРНИ СПИСОК ОТ 1 ДО 300
ВЕРНИ СПИСОК ОТ 1 ДО 630
ВЕРНИ СПИСОК ОТ 1 ДО 690
ВЕРНИ СПИСОК ОТ 1 ДО 910*/