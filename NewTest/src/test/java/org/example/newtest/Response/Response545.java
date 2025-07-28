package org.example.newtest.Response;

public class Response545 {
    public static boolean test545(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 23000 && age <= 50000
                && salary >= 23000 && salary <= 50000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 29 до 30
Salary: от 23000 руб до 50000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 1 год*/