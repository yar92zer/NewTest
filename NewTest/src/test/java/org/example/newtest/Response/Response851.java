package org.example.newtest.Response;

public class Response851 {
    public static boolean test851(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 23 && age <= 24
                && salary >= 25000 && salary <= 30000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Александр"
Age: от 23 до 24
Salary: от 25000 руб до 30000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 1 год*/