package org.example.newtest.Response;

public class Response473 {
    public static boolean test473(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 27 && age <= 28
                && salary >= 29000 && salary <= 43000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 27 до 28
Salary: от 29000 руб до 43000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 7 лет*/