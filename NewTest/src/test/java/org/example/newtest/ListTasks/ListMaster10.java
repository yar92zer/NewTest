package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class ListMaster10 {
    List<Integer> getListWithNumberFromOneToFiveHundredForty() {
        return IntStream.rangeClosed(1, 540).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToForty() {
        return IntStream.rangeClosed(1, 40).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToOneHundredTwenty(){
        return IntStream.rangeClosed(1, 120).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToEightHundredSeventy(){
        return IntStream.rangeClosed(1, 870).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToFiveHundredNinty(){
        return IntStream.rangeClosed(1, 590).boxed().toList();
    }
    @Test
    public void getListWithNumberFromOneToFiveHundredNintyTest(){
        System.out.println(getListWithNumberFromOneToFiveHundredNinty());
    }
    @Test
    public void getListWithNumberFormOneToEightHundredSeventyTest(){
        System.out.println(getListWithNumberFromOneToEightHundredSeventy());
    }

    @Test
    public void getListWithNumberFromOneToOneHundredTwentyTest(){
        System.out.println(getListWithNumberFromOneToOneHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToFortyTest() {
        System.out.println(getListWithNumberFromOneToForty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredFortyTest() {
        System.out.println(getListWithNumberFromOneToFiveHundredForty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 540
ВЕРНИ СПИСОК ОТ 1 ДО 40
ВЕРНИ СПИСОК ОТ 1 ДО 120
ВЕРНИ СПИСОК ОТ 1 ДО 870
ВЕРНИ СПИСОК ОТ 1 ДО 590*/