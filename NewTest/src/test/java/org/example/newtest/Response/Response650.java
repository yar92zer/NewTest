package org.example.newtest.Response;

public class Response650 {
    public static boolean test650(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 41 && age <= 59
                && salary >= 22000 && salary <= 28000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 41 до 59
Salary: от 22000 руб до 28000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 6 лет*/