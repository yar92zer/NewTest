package org.example.newtest.Response;

public class Response197 {
    public static boolean test197(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 25 && age <= 34
                && salary >= 28000 && salary <= 29000
                && country.equalsIgnoreCase("Нидерлады")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 25 до 34
Salary: от 28000 руб до 29000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 14 лет*/