package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster23 {
    List<Integer> getListWithNumberFromOneToOneHundred() {
        return IntStream.rangeClosed(1, 100).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSeventy() {
        return IntStream.rangeClosed(1, 770).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFifty() {
        return IntStream.rangeClosed(1, 50).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredTen() {
        return IntStream.rangeClosed(1, 310).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredSeventy() {
        return IntStream.rangeClosed(1, 970).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTenTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToFiftyTest() {
        System.out.println(getListWithNumberFromOneToFifty());
    }

    @Test
    public void getListWithNumberFromOneSevenHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTest() {
        System.out.println(getListWithNumberFromOneToOneHundred());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 100
ВЕРНИ СПИСОК ОТ 1 ДО 770
ВЕРНИ СПИСОК ОТ 1 ДО 50
ВЕРНИ СПИСОК ОТ 1 ДО 310
ВЕРНИ СПИСОК ОТ 1 ДО 970
*/