package org.example.newtest.Response;

public class Response530 {
    public static boolean test530(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 24 && age <= 34
                && salary >= 23000 && salary <= 29000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 24 до 34
Salary: от 23000 руб до 29000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 15 лет*/