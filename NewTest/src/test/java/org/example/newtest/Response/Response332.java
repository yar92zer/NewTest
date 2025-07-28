package org.example.newtest.Response;

public class Response332 {
    public static boolean test332(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 29 && age <= 31
                && salary >= 41000 && salary <= 56000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 29 до 31
Salary: от 41000 руб до 56000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 10 лет*/