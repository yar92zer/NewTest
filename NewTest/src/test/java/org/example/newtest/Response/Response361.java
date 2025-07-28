package org.example.newtest.Response;

public class Response361 {
    public static boolean test361(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 25 && age <= 29
                && salary >= 27000 && salary <= 28000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 25 до 29
Salary: от 27000 руб до 28000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 7 лет*/