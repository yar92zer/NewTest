package org.example.newtest.Response;

public class Response483 {
    public static boolean test483(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 27 && age <= 29
                && salary >= 20000 && salary <= 25000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 27 до 29
Salary: от 20000 руб до 25000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 10 лет*/