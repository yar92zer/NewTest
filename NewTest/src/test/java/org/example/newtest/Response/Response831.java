package org.example.newtest.Response;

public class Response831 {
    public static boolean test831(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 26 && age <= 36
                && salary >= 30000 && salary <= 43000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Артем"
Age: от 26 до 36
Salary: от 30000 руб до 43000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 10 лет*/