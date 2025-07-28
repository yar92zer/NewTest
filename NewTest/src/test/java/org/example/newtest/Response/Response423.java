package org.example.newtest.Response;

public class Response423 {
    public static boolean test423(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 43 && age <= 55
                && salary >= 30000 && salary <= 34000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 43 до 55
Salary: от 30000 руб до 34000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 15 лет*/