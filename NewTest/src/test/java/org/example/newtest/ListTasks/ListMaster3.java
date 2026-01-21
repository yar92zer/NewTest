package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster3 {
    List<Integer> getListWithNumberFromOneToSixHundredFifty(){
        return IntStream.rangeClosed(1, 650).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToSixHundredEighty(){
        return IntStream.rangeClosed(1, 680).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToNineHundredTen(){
        return IntStream.rangeClosed(1, 910).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredThirty(){
        return IntStream.rangeClosed(1, 830).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredNinety(){
        return IntStream.rangeClosed(1, 590).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredNinetyTest(){
        System.out.println(getListWithNumberFromOneToFiveHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredThirtyTest(){
        System.out.println(getListWithNumberFromOneToEightHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredTenTest(){
        System.out.println(getListWithNumberFromOneToNineHundredTen());
    }
    @Test
    public void getListWithNumberFromOneToSixHundredFiftyTest(){
        System.out.println(getListWithNumberFromOneToSixHundredFifty());
    }
    @Test
    public void getListWithNumberFromOneToSixHundredEightyTest(){
        System.out.println(getListWithNumberFromOneToSixHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 650
ВЕРНИ СПИСОК ОТ 1 ДО 680
ВЕРНИ СПИСОК ОТ 1 ДО 910
ВЕРНИ СПИСОК ОТ 1 ДО 830
ВЕРНИ СПИСОК ОТ 1 ДО 590*/