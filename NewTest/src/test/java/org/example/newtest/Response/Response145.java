package org.example.newtest.Response;

public class Response145 {
    public static boolean test145(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 28 && age <= 48
                && salary >= 26000 && salary <= 32000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 28 до 48
Salary: от 26000 руб до 32000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 10 лет*/