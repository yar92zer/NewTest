package org.example.newtest.Response;

public class Response97 {
    public static boolean test97(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 22 && age <= 24
                && salary >= 24000 && salary <= 33000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 22 до 24
Salary: от 24000 руб до 33000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 2 года*/