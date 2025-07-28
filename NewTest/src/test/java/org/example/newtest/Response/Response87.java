package org.example.newtest.Response;

public class Response87 {
    public static boolean test87(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 25 && age <= 30
                && salary >= 30000 && salary <= 60000
                && country.equalsIgnoreCase("Нидерлады")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 25 до 30
Salary: от 30000 руб до 60000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 5 лет*/