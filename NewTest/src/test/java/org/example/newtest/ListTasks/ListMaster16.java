package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class ListMaster16 {
    List<Integer> getListWithNumberFromOneToSevenHundredTwenty() {
        return IntStream.rangeClosed(1, 720).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredThirty() {
        return IntStream.rangeClosed(1, 230).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTwenty() {
        return IntStream.rangeClosed(1, 20).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToSixHundredFifty() {
        return IntStream.rangeClosed(1, 650).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNineHundredFifty() {
        return IntStream.rangeClosed(1, 950).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToNineHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToNineHundredFifty());
    }

    @Test
    public void getListWithNumberFormOneToSixHundredFiftyTest() {
        System.out.println(getListWithNumberFormOneToSixHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToTwentyTest() {
        System.out.println(getListWithNumberFromOneToTwenty());
    }

    @Test
    public void getListWithNumberFromOneToTowHundredThirtyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredThirty());
    }

    @Test
    public void getListWithNumberFromOneToSevenHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSevenHundredTwenty());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 720
ВЕРНИ СПИСОК ОТ 1 ДО 230
ВЕРНИ СПИСОК ОТ 1 ДО 20
ВЕРНИ СПИСОК ОТ 1 ДО 650
ВЕРНИ СПИСОК ОТ 1 ДО 950*/