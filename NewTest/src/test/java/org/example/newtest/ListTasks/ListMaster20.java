package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster20 {
    List<Integer> getListWithNumberFromOneToForeHundredThirty() {
        return IntStream.rangeClosed(1, 430).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredFifty() {
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredSixty() {
        return IntStream.rangeClosed(1, 960).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToForty() {
        return IntStream.rangeClosed(1, 40).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneThousand() {
        return IntStream.rangeClosed(1, 1000).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToOneThousandTest() {
        System.out.println(getListWithNumberFromOneToForty());
    }

    @Test
    public void getListWithNumberFromOneToFortyTest() {
        System.out.println(getListWithNumberFromOneToForty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToForeHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToForeHundredThirty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 430
ВЕРНИ СПИСОК ОТ 1 ДО 150
ВЕРНИ СПИСОК ОТ 1 ДО 960
ВЕРНИ СПИСОК ОТ 1 ДО 40
ВЕРНИ СПИСОК ОТ 1 ДО 1000
*/