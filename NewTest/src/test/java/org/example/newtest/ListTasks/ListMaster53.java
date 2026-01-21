package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.*;

import org.junit.Test;

public class ListMaster53 {
    List<Integer> getListWithNumberFromOneToNineHundred() {
        return IntStream.rangeClosed(1, 900).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredSixty() {
        return IntStream.rangeClosed(1, 360).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToOneHundredSeventy() {
        return IntStream.rangeClosed(1, 170).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredTwenty() {
        return IntStream.rangeClosed(1, 920).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredSeventyTest() {
        System.out.println(getListWithNumberFromOneToOneHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTest() {
        System.out.println(getListWithNumberFromOneToNineHundred());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 900
ВЕРНИ СПИСОК ОТ 1 ДО 620
ВЕРНИ СПИСОК ОТ 1 ДО 360
ВЕРНИ СПИСОК ОТ 1 ДО 170
ВЕРНИ СПИСОК ОТ 1 ДО 920*/