package org.example.newtest.Response;

public class Response793 {
    public static boolean test739(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Максим")
                && age >= 34 && age <= 38
                && salary >= 40000 && salary <= 47000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Максим"
Age: от 34 до 38
Salary: от 40000 руб до 47000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 1 год*/