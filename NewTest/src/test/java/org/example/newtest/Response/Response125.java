package org.example.newtest.Response;

public class Response125 {
    public static boolean test125(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 22 && age <= 30
                && salary >= 25000 && salary <= 26000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 22 до 30
Salary: от 25000 руб до 26000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 11 лет*/