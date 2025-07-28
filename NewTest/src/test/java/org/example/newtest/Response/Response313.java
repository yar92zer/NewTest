package org.example.newtest.Response;

public class Response313 {
    public static boolean test313(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 21 && age <= 27
                && salary >= 52000 && salary <= 61000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 21 до 27
Salary: от 52000 руб до 61000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 9 лет*/