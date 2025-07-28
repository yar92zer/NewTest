package org.example.newtest.Response;

public class Response385 {
    public static boolean test385(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 43 && age <= 46
                && salary >= 20000 && salary <= 21000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 43 до 46
Salary: от 20000 руб до 21000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 1 год*/