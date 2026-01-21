package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster32 {
    List<Integer> getListWithNumberFromOneToNineHundredSeventy() {
        return IntStream.rangeClosed(1, 970).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTwenty() {
        return IntStream.rangeClosed(1, 20).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredSeventy() {
        return IntStream.rangeClosed(1, 370).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredThirty() {
        return IntStream.rangeClosed(1, 330).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToTwentyTest() {
        System.out.println(getListWithNumberFromOneToTwenty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredSeventy());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 970
ВЕРНИ СПИСОК ОТ 1 ДО 20
ВЕРНИ СПИСОК ОТ 1 ДО 370
ВЕРНИ СПИСОК ОТ 1 ДО 620
ВЕРНИ СПИСОК ОТ 1 ДО 330*/