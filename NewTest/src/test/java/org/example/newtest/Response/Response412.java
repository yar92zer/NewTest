package org.example.newtest.Response;

public class Response412 {
    public static boolean test412(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 18 && age <= 30
                && salary >= 36000 && salary <= 47000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 18 до 30
Salary: от 36000 руб до 47000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 10 лет*/