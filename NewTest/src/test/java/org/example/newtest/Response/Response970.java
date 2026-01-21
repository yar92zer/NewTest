package org.example.newtest.Response;

public class Response970 {
    public static boolean test970(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 21 && age <= 36
                && salary >= 31000 && salary <= 39000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Александр"
Age: от 21 до 36
Salary: от 31000 руб до 39000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 13 лет*/