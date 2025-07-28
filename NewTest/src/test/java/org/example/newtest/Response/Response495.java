package org.example.newtest.Response;

public class Response495 {
    public static boolean test495(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 56 && age <= 57
                && salary >= 33000 && salary <= 38000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 56 до 57
Salary: от 33000 руб до 38000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 5 лет*/