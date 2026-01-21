package org.example.newtest.ListTasks;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;

public class ListMaster18 {
    List<Integer> getListWithNumberFromOneToFiveHundred() {
        return IntStream.rangeClosed(1, 500).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredFifty() {
        return IntStream.rangeClosed(1, 250).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToSixHundredTwenty() {
        return IntStream.rangeClosed(1, 620).boxed().toList();
    }

    List<Integer> getListWithNumberFormOneToForeHundredTwenty() {
        return IntStream.rangeClosed(1, 420).boxed().toList();
    }

    List<Integer> getListWithNumberFromOneToTowHundredTwenty() {
        return IntStream.rangeClosed(1, 220).boxed().toList();
    }

    @Test
    public void getListWithNumberFromOneToTowHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToForeHundredTwentyTest() {
        System.out.println(getListWithNumberFormOneToForeHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToSixHundredTwentyTest() {
        System.out.println(getListWithNumberFromOneToSixHundredTwenty());
    }

    @Test
    public void getListWithNumberFromOneToHundredFiftyTest() {
        System.out.println(getListWithNumberFromOneToTowHundredFifty());
    }

    @Test
    public void getListWithNumberFromOneToFiveHundredTest() {
        System.out.println(getListWithNumberFromOneToFiveHundred());
    }

    public static class ListMaster20 {
        List<Integer> getListWithNumberFromOneToOneHundredEighty() {
            return IntStream.rangeClosed(1, 180).boxed().toList();
        }

        List<Integer> getListWithNumberFromOneToTowHundred() {
            return IntStream.rangeClosed(1, 200).boxed().toList();
        }

        List<Integer> getListWithNumberFromOneToThreeHundredSixty() {
            return IntStream.rangeClosed(1, 360).boxed().toList();
        }

        List<Integer> getListWithNumberFromOneToThreeHundredThirty() {
            return IntStream.rangeClosed(1, 330).boxed().toList();
        }

        List<Integer> getListWithNumberFromOneToSevenHundredSeventy() {
            return IntStream.rangeClosed(1, 770).boxed().toList();
        }

        @Test
        public void getListWithNumberFromOneToSevenHundredSeventyTest() {
            System.out.println(getListWithNumberFromOneToSevenHundredSeventy());
        }

        @Test
        public void getListWithNumberFromOneToThreeHundredThirtyTest() {
            System.out.println(getListWithNumberFromOneToThreeHundredThirty());
        }

        @Test
        public void getListWithNumberFromOneToThreeHundredSixtyTest() {
            System.out.println(getListWithNumberFromOneToThreeHundredSixty());
        }

        @Test
        public void getListWithNumberFromOneToTowHundredTest() {
            System.out.println(getListWithNumberFromOneToTowHundred());
        }

        @Test
        public void getListWithNumberFromOneToOneHundredEightyTest() {
            System.out.println(getListWithNumberFromOneToOneHundredEighty());
        }
    }
}
/*
ВЕРНИ СПИСОК ОТ 1 ДО 500
ВЕРНИ СПИСОК ОТ 1 ДО 250
ВЕРНИ СПИСОК ОТ 1 ДО 620
ВЕРНИ СПИСОК ОТ 1 ДО 420
ВЕРНИ СПИСОК ОТ 1 ДО 220*/