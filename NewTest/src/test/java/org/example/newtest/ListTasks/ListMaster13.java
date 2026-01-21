package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster13 {
    List<Integer> getListWithNumberFormOneToThreeHundredTen() {
        return IntStream.rangeClosed(1, 310).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredForty() {
        return IntStream.rangeClosed(1, 640).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredSixty() {
        return IntStream.rangeClosed(1, 260).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundred() {
        return IntStream.rangeClosed(1, 500).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToForeHundredSeventy(){
        return IntStream.rangeClosed(1, 470).boxed().toList();
    }
    @Test
    public void getListWithNumberFromOneToForeHundredSeventyTest(){
        System.out.println(getListWithNumberFromOneToForeHundredSeventy());
    }
    @Test
    public void getListWithNumberFromOneToFiveHundredTest() {
        System.out.println(getListWithNumberFromOneToFiveHundred());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredSixty());
    }

    @Test
    public void getListWithNumberFormOneToSixHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredForty());
    }

    @Test
    public void getListWithNumberFormOneThreeHundredTenTest() {
        System.out.println(getListWithNumberFormOneToThreeHundredTen());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 310
ВЕРНИ СПИСОК ОТ 1 ДО 640
ВЕРНИ СПИСОК ОТ 1 ДО 260
ВЕРНИ СПИСОК ОТ 1 ДО 500
ВЕРНИ СПИСОК ОТ 1 ДО 470
*/