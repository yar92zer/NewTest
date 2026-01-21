package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster65 {
    List<Integer> getListWithNumberFromOneToNineHundredTwenty() {
        return IntStream.rangeClosed(1, 920).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneThousand() {
        return IntStream.rangeClosed(1, 1000).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundred() {
        return IntStream.rangeClosed(1, 800).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredThirty() {
        return IntStream.rangeClosed(1, 630).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredEighty() {
        return IntStream.rangeClosed(1, 180).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToOneHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredTest() {
        System.out.println(getListWithNumberFromOneToEightHundred());
    }

    @Test
    public void getListWithNumberFromOneToOneThousandTest() {
        System.out.println(getListWithNumberFromOneToOneThousand());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 920
ВЕРНИ СПИСОК ОТ 1 ДО 1000
ВЕРНИ СПИСОК ОТ 1 ДО 800
ВЕРНИ СПИСОК ОТ 1 ДО 630
ВЕРНИ СПИСОК ОТ 1 ДО 180*/