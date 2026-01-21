package org.example.newtest.Response;

public class Response850 {
    public static boolean test850(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 20 && age <= 39
                && salary >= 24000 && salary <= 32000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15;
    }
}
/*Name: "Михаил"
Age: от 20 до 39
Salary: от 24000 руб до 32000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 15 лет*/