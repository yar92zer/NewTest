package org.example.newtest.Response;

public class Response393 {
    public static boolean test395(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 29 && age <= 31
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 29 до 31
Salary: от 27000 руб до 29000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 12 лет*/