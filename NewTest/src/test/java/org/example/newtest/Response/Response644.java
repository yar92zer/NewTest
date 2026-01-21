package org.example.newtest.Response;

public class Response644 {
    public static boolean test644(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 38 && age <= 42
                && salary >= 29000 && salary <= 36000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 38 до 42
Salary: от 29000 руб до 36000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 6 лет*/