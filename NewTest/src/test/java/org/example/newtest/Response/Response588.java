package org.example.newtest.Response;

public class Response588 {
    public static boolean test588(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 23 && age <= 39
                && salary >= 20000 && salary <= 29000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 23 до 39
Salary: от 20000 руб до 29000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 12 лет*/