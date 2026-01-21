package org.example.newtest.Response;

public class Response900 {
    public static boolean test900(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 23 && age <= 37
                && salary >= 26000 && salary <= 30000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Александр"
Age: от 23 до 37
Salary: от 26000 руб до 30000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 8 лет*/