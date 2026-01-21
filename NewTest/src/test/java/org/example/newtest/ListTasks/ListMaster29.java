package org.example.newtest.ListTasks;

import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class ListMaster29 {
    List<Integer> getListWithNumberFromOneToEightHundredSixty() {
        return IntStream.rangeClosed(1, 860).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredForty() {
        return IntStream.rangeClosed(1, 140).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredFifty() {
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSixty() {
        return IntStream.rangeClosed(1, 670).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToNineHundredTen() {
        return IntStream.rangeClosed(1, 910).boxed().toList();
    }

    @Test
    public void getListWithNumberFormOneToNineHundredTenTest() {
        System.out.println(getListWithNumberFormOneToNineHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredForty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredSixty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 860
ВЕРНИ СПИСОК ОТ 1 ДО 140
ВЕРНИ СПИСОК ОТ 1 ДО 150
ВЕРНИ СПИСОК ОТ 1 ДО 760
ВЕРНИ СПИСОК ОТ 1 ДО 910*/