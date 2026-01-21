package org.example.newtest.Response;

public class Response758 {
    public static boolean test758(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 44 && age <= 53
                && salary >= 22000 && salary <= 32000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Иван"
Age: от 44 до 53
Salary: от 22000 руб до 32000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 11 лет*/