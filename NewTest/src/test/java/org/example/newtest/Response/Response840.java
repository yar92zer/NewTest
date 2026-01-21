package org.example.newtest.Response;

public class Response840 {
    public static boolean test840(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 24 && age <= 25
                && salary >= 26000 && salary <= 34000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Михаил"
Age: от 24 до 25
Salary: от 26000 руб до 34000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 5 лет*/