package org.example.newtest.Response;

public class Response656 {
    public static boolean test656(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 21 && age <= 35
                && salary >= 22000 && salary <= 32000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Михаил"
Age: от 21 до 35
Salary: от 22000 руб до 32000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 11 лет*/