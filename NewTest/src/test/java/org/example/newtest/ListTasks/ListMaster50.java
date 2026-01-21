package org.example.newtest.ListTasks;

import java.util.*;
import java.util.stream.IntStream;

import org.junit.Test;

public class ListMaster50 {
    List<Integer> getListWithNumberFromOneToFourHundredFourty() {
        return IntStream.rangeClosed(1, 440).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredSixty() {
        return IntStream.rangeClosed(1, 360).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredThirty() {
        return IntStream.rangeClosed(1, 930).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredEighty() {
        return IntStream.rangeClosed(1, 580).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredEighty() {
        return IntStream.rangeClosed(1, 980).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredEightTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToFourHundredFourtyTest() {
        System.out.println(getListWithNumberFromOneToFourHundredFourty());
    }
}
/*ВЕРНИ СПИСОК ОТ 1 ДО 440
ВЕРНИ СПИСОК ОТ 1 ДО 360
ВЕРНИ СПИСОК ОТ 1 ДО 930
ВЕРНИ СПИСОК ОТ 1 ДО 580
ВЕРНИ СПИСОК ОТ 1 ДО 980*/