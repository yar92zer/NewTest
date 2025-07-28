package org.example.newtest.Response;

public class Response407 {
    public static boolean test407(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 50 && age <= 52
                && salary >= 22000 && salary <= 37000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 50 до 52
Salary: от 22000 руб до 37000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 15 лет*/