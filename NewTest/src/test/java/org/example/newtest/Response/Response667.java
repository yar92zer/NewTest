package org.example.newtest.Response;

public class Response667 {
    public static boolean test667(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 23 && age <= 24
                && salary >= 44000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Артем"
Age: от 23 до 24
Salary: от 44000 руб до 48000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 1 год*/