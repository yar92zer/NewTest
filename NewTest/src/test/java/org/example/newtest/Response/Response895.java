package org.example.newtest.Response;

public class Response895 {
    public static boolean test895(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 26 && age <= 28
                && salary >= 50000 && salary <= 51000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Александр"
Age: от 26 до 28
Salary: от 50000 руб до 51000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 8 лет*/