package org.example.newtest.Response;

public class Response128 {
    public static boolean test128(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 20 && age <= 35
                && salary >= 24000 && salary <= 58000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 20 до 35
Salary: от 24000 руб до 58000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 12 лет*/