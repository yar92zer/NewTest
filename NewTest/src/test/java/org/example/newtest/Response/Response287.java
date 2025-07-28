package org.example.newtest.Response;

public class Response287 {
    public static boolean test287(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 27 && age <= 29
                && salary >= 33000 && salary <= 350000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 27 до 29
Salary: от 33000 руб до 35000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 10 лет*/