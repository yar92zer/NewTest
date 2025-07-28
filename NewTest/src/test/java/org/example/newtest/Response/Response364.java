package org.example.newtest.Response;

public class Response364 {
    public static boolean test354(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 28 && age <= 47
                && salary >= 62000 && salary <= 660000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 28 до 47
Salary: от 62000 руб до 66000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 12 лет*/