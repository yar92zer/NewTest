package org.example.newtest.Response;

public class Response439 {
    public static boolean test439(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 48 && age <= 59
                && salary >= 22000 && salary <= 25000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 48 до 59
Salary: от 22000 руб до 25000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 11 лет*/