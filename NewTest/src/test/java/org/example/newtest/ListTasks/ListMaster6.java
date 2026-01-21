package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class ListMaster6 {
    List<Integer> getListWithNumberFromOneToEightHundredNinty(){
        return IntStream.rangeClosed(1, 890).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToTowHundredTen(){
        return IntStream.rangeClosed(1, 210).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredTen(){
        return IntStream.rangeClosed(1, 310).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToSevenHundredThirty(){
        return IntStream.rangeClosed(1, 730).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixtyn(){
        return IntStream.rangeClosed(1, 60).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToSixtynTest(){
        System.out.println(getListWithNumberFromOneToSixtyn());
    }

    @Test
    public void getListWithNumberFromOneToSevanHundredThirtyTest(){
        System.out.println(getListWithNumberFromOneToSevenHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToThreeHundredTenTest(){
        System.out.println(getListWithNumberFromOneToThreeHundredTen());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredTenTest(){
        System.out.println(getListWithNumberFromOneToTowHundredTen());
    }
    @Test
    public void getListWithNumberFromOneToEightHundredNintyTest(){
        System.out.println(getListWithNumberFromOneToEightHundredNinty());}
    }
/*
ВЕРНИ СПИСОК ОТ 1 ДО 890
ВЕРНИ СПИСОК ОТ 1 ДО 210
ВЕРНИ СПИСОК ОТ 1 ДО 310
ВЕРНИ СПИСОК ОТ 1 ДО 730
ВЕРНИ СПИСОК ОТ 1 ДО 60*/