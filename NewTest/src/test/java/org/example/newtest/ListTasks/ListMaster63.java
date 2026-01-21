package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster63 {
    List<Integer> getListWithNumberFromOneToSixHundredEighty() {
        return IntStream.rangeClosed(1, 680).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundred() {
        return IntStream.rangeClosed(1, 600).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightyHundredThirty() {
        return IntStream.rangeClosed(1, 830).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredFourty() {
        return IntStream.rangeClosed(1, 940).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSeventy() {
        return IntStream.rangeClosed(1, 770).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToEightyHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToEightyHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTest() {
        System.out.println(getListWithNumberFromOneToSixHundred());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 680
ВЕРНИ СПИСОК ОТ 1 ДО 600
ВЕРНИ СПИСОК ОТ 1 ДО 830
ВЕРНИ СПИСОК ОТ 1 ДО 940
ВЕРНИ СПИСОК ОТ 1 ДО 770*/