package org.example.newtest.Response;

public class Response369 {
    public static boolean test369(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 33 && age <= 38
                && salary >= 25000 && salary <= 32000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 33 до 38
Salary: от 25000 руб до 32000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 10 лет*/