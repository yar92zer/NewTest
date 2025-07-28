package org.example.newtest.Response;

public class Response390 {
    public static boolean test390(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 24 && age <= 29
                && salary >= 40000 && salary <= 52000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 24 до 29
Salary: от 40000 руб до 52000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 11 лет*/