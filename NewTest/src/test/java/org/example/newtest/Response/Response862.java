package org.example.newtest.Response;

public class Response862 {
    public static boolean test862(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 27 && age <= 29
                && salary >= 30000 && salary <= 31000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Михаил"
Age: от 27 до 29
Salary: от 30000 руб до 31000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 10 лет*/