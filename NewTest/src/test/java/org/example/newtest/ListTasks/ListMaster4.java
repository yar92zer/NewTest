package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster4 {
    List<Integer> getListWithNumberFromOneToNineHundredEighty() {
        return IntStream.rangeClosed(1, 980).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSeventy() {
        return IntStream.rangeClosed(1, 70).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFourty(){
     return IntStream.rangeClosed(1, 40).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToForeHundredEighty(){
        return IntStream.rangeClosed(1, 480).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredFourty(){
        return IntStream.rangeClosed(1, 940).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFourtyTest(){
        System.out.println(getListWithNumberFromOneToNineHundredFourty());
    }

    @Test
    public void getListWithNumberFromOneToForeHundredEightyTest(){
        System.out.println(getListWithNumberFromOneToForeHundredEighty());
    }

    @Test
    public void getListWithNumberFromOneToFourtyTest(){
        System.out.println(getListWithNumberFromOneToFourty());
    }

    @Test
    public void getListWithNumberFromOneToSeventyTest() {
        System.out.println(getListWithNumberFromOneToSeventy());
    }

    @Test
    public void getListWithNumberFromOneToNineHundredEightyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredEighty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 980
ВЕРНИ СПИСОК ОТ 1 ДО 70
ВЕРНИ СПИСОК ОТ 1 ДО 40
ВЕРНИ СПИСОК ОТ 1 ДО 480
ВЕРНИ СПИСОК ОТ 1 ДО 940*/