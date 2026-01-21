package org.example.newtest.Response;

public class Response645 {
    public static boolean test645(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 29 && age <= 42
                && salary >= 29000 && salary <= 56000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 29 до 42
Salary: от 29000 руб до 56000 руб
Country: "Испания"
Gender: "Женский"
Experience: 14 лет*/