package org.example.newtest.Response;

public class Response266 {
    public static boolean test266(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 43 && age <= 49
                && salary >= 41000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 43 до 49
Salary: от 41000 руб до 48000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 10 лет*/