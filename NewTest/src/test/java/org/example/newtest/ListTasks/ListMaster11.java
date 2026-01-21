package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster11 {
    List<Integer> getListWithNumberFormOneToNineHundredFifty() {
        return IntStream.rangeClosed(1, 950).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToForeHundredTen() {
        return IntStream.rangeClosed(1, 410).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToNineHundredThirty() {
        return IntStream.rangeClosed(1, 930).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToThreeHundredFifty() {
        return IntStream.rangeClosed(1, 350).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToThreeHundredSixty() {
        return IntStream.rangeClosed(1, 360).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredSixty() {
        System.out.println(getListWithNumberFormOneToThreeHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredFiftyTest() {
        System.out.println(getListWithNumberFormOneToThreeHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredThirtyTest() {
        System.out.println(getListWithNumberFormOneToNineHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToForeHundredTenTest() {
        System.out.println(getListWithNumberFormOneToForeHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFiftyTest() {
        System.out.println(getListWithNumberFormOneToNineHundredFifty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 950
ВЕРНИ СПИСОК ОТ 1 ДО 410
ВЕРНИ СПИСОК ОТ 1 ДО 930
ВЕРНИ СПИСОК ОТ 1 ДО 350
ВЕРНИ СПИСОК ОТ 1 ДО 360*/