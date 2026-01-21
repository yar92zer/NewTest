package org.example.newtest.Response;

public class Response690 {
    public static boolean test690(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 32 && age <= 46
                && salary >= 29000 && salary <= 30000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6;
    }
}
/*Name: "Александр"
Age: от 32 до 46
Salary: от 29000 руб до 30000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 6 лет*/