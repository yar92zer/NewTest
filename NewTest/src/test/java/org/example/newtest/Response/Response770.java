package org.example.newtest.Response;

public class Response770 {
    public static boolean test770(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Наталия")
                && age >= 37 && age <= 39
                && salary >= 56000 && salary <= 57000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Наталья"
Age: от 37 до 39
Salary: от 56000 руб до 57000 руб
Country: "Нидерланды"
Gender: "Женский"
Experience: 7 лет*/