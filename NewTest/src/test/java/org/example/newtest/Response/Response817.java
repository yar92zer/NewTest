package org.example.newtest.Response;

public class Response817 {
    public static boolean test817(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 52 && age <= 56
                && salary >= 35000 && salary <= 44000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Михаил"
Age: от 52 до 56
Salary: от 35000 руб до 44000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 1 год*/