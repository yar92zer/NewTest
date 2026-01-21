package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class ListMaster8 {
    List<Integer> getListWithNumberFormOneToEightHundredTen() {
        return IntStream.rangeClosed(1, 810).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToThreeHundredNinety() {
        return IntStream.rangeClosed(1, 390).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToEightHundredFifty() {
        return IntStream.rangeClosed(1, 850).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToNinety() {
        return IntStream.rangeClosed(1, 90).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToFiveHundredForty(){
        return IntStream.rangeClosed(1, 540).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredFortyTest(){
        System.out.println(getListWithNumberFromOneToFiveHundredForty());
    }

    @Test
    public void getListWithNumberFormOneToNinetyTest() {
        System.out.println(getListWithNumberFromOneToNinety());
    }

    @Test
    public void getListWithNumberFromOneEightHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToEightHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredFiftyTest() {

    }

    @Test
    public void getListWithNumberFromOneToThreeHundredNinetyTest() {
        System.out.println(getListWithNumberFromOneToThreeHundredNinety());
    }

    @Test
    public void getListWithNumberFromOneToEightHundredTenTest() {
        System.out.println(getListWithNumberFormOneToEightHundredTen());
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 810
ВЕРНИ СПИСОК ОТ 1 ДО 390
ВЕРНИ СПИСОК ОТ 1 ДО 850
ВЕРНИ СПИСОК ОТ 1 ДО 90
ВЕРНИ СПИСОК ОТ 1 ДО 540
*/