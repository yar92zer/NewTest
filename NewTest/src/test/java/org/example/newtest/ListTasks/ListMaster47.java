package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster47 {
    List<Integer> getListWithNumberFromOneToFiveHundredThirty() {
        return IntStream.rangeClosed(1, 530).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredSeventy() {
        return IntStream.rangeClosed(1, 970).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredSixty() {
        return IntStream.rangeClosed(1, 160).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredFourty() {
        return IntStream.rangeClosed(1, 940).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredThirty() {
        return IntStream.rangeClosed(1, 830).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToEightHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredThirty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 530
ВЕРНИ СПИСОК ОТ 1 ДО 970
ВЕРНИ СПИСОК ОТ 1 ДО 160
ВЕРНИ СПИСОК ОТ 1 ДО 940
ВЕРНИ СПИСОК ОТ 1 ДО 830*/