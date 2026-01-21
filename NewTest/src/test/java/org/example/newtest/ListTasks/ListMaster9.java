package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster9 {
    List<Integer> getListWithNumberFormOneToThreeHundredForty(){
        return IntStream.rangeClosed(1, 340).boxed().toList();
    }
    List <Integer> getLitWithNumberFromOneToOneHundredFifty(){
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToSevenHundredSixty(){
        return IntStream.rangeClosed(1, 760).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToFiveHundredTen(){
        return IntStream.rangeClosed(1, 510).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToEightHundredEighty(){
        return IntStream.rangeClosed(1, 880).boxed().toList();
    }
    @Test
    public void getListWithNumberFromOneTOEightHundredEightyTest(){
        System.out.println(getListWithNumberFromOneToEightHundredEighty());
    }
    @Test
    public void getListWithNumberFromOneToFiveHundredTenTest(){
        System.out.println(getListWithNumberFromOneToFiveHundredTen());
    }
    @Test
    public void getListWithNumberFormOneToSevenHundredSixty(){
        System.out.println(getListWithNumberFromOneToSevenHundredSixty());
    }
    @Test
    public void getListWithNumberFromOneToOneHundredFiftyTest(){
        System.out.println(getLitWithNumberFromOneToOneHundredFifty());
    }
    @Test
    public void getListWithNumberFromOneToThreeHundredFortyTest(){
        System.out.println(getListWithNumberFormOneToThreeHundredForty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 340
ВЕРНИ СПИСОК ОТ 1 ДО 150
ВЕРНИ СПИСОК ОТ 1 ДО 760
ВЕРНИ СПИСОК ОТ 1 ДО 510
ВЕРНИ СПИСОК ОТ 1 ДО 880*/