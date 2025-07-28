package org.example.newtest.Response;

public class Response267 {
    public static boolean test267(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 23 && age <= 34
                && salary >= 26000 && salary <= 29000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 23 до 34
Salary: от 26000 руб до 29000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 15 лет*/