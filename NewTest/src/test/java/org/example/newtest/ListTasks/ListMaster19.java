package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster19 {
    List<Integer> getListWithNumberFromOneToOneThousand() {
        return IntStream.rangeClosed(1, 1000).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundred() {
        return IntStream.rangeClosed(1, 500).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredTwenty() {
        return IntStream.rangeClosed(1, 720).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSevenHundredSixty() {
        return IntStream.rangeClosed(1, 760).boxed().toList();
    }
    List<Integer> getListWithNumberFromOneToOneHundredFifty(){
        return IntStream.rangeClosed(1, 150).boxed().toList();
    }
    @Test
    public void getListWithNumberFromOneToOneHundredFiftyTest(){
        System.out.println(getListWithNumberFromOneToOneHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredSixtyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredSixty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredTwenty());
    }

    @Test
    public void getListWithNumberFormOneToFiveHundredTest() {
        System.out.println(getListWithNumberFromOneToFiveHundred());
    }

    @Test
    public void getListWithNumberFromOneToOneThousandTest() {
        System.out.println(getListWithNumberFromOneToOneThousand());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 1000
ВЕРНИ СПИСОК ОТ 1 ДО 500
ВЕРНИ СПИСОК ОТ 1 ДО 720
ВЕРНИ СПИСОК ОТ 1 ДО 760
ВЕРНИ СПИСОК ОТ 1 ДО 150*/