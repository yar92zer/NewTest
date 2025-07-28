package org.example.newtest.Response;

public class Response76 {
    public static boolean test76(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 25 && age <= 25
                && salary >= 25 && salary <= 25
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужсокй")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 25 до 25
Salary: от 62000 руб до 63000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 4 года*/