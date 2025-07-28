package org.example.newtest.Response;

public class Response477 {
    public static boolean test477(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 38 && age <= 41
                && salary >= 40000 && salary <= 50000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 38 до 41
Salary: от 40000 руб до 50000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 14 лет*/