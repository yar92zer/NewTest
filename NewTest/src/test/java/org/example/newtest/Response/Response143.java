package org.example.newtest.Response;

public class Response143 {
    public static boolean test143(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 30 && age <= 51
                && salary >= 49000 && salary <= 51000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 30 до 51
Salary: от 49000 руб до 51000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 11 лет*/