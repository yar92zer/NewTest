package org.example.newtest.Response;

public class Response848 {
    public static boolean test848(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 29 && age <= 34
                && salary >= 28000 && salary <= 40000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Иван"
Age: от 29 до 34
Salary: от 28000 руб до 40000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 13 лет*/