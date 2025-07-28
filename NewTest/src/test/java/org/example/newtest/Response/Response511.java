package org.example.newtest.Response;

public class Response511 {
    public static boolean test(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 23 && age <= 30
                && salary >= 35000 && salary <= 37000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 23 до 30
Salary: от 35000 руб до 37000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 6 лет*/