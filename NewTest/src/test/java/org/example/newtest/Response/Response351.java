package org.example.newtest.Response;

public class Response351 {
    public static boolean test351(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 48 && age <= 54
                && salary >= 33000 && salary <= 55000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 48 до 54
Salary: от 33000 руб до 55000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 13 лет*/