package org.example.newtest.Response;

public class Response432 {
    public static boolean test432(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 35 && age <= 52
                && salary >= 29000 && salary <= 48000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 35 до 52
Salary: от 29000 руб до 48000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 11 лет*/