package org.example.newtest.Response;

public class Response957 {
    public static boolean test957(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 34 && age <= 41
                && salary >= 23000 && salary <= 39000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Александр"
Age: от 34 до 41
Salary: от 23000 руб до 39000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 8 лет*/