package org.example.newtest.Response;

public class Response824 {
    public static boolean test824(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 20 && age <= 38
                && salary >= 31000 && salary <= 32000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Сергей"
Age: от 20 до 38
Salary: от 31000 руб до 32000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 11 лет*/