package org.example.newtest.Response;

public class Response875 {
    public static boolean test875(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 25 && age <= 28
                && salary >= 29000 && salary <= 51000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Артем"
Age: от 25 до 28
Salary: от 29000 руб до 51000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 8 лет*/