package org.example.newtest.Response;

public class Response915 {
    public static boolean test915(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 31 && age <= 41
                && salary >= 42000 && salary <= 43000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13;
    }
}
/*Name: "Оксана"
Age: от 31 до 41
Salary: от 42000 руб до 43000 руб
Country: "Испания"
Gender: "Женский"
Experience: 13 лет*/