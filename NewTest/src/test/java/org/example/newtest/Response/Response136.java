package org.example.newtest.Response;

public class Response136 {
    public static boolean test136(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 19 && age <= 34
                && salary >= 22000 && salary <= 31000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 19 до 34
Salary: от 22000 руб до 31000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 12 лет*/