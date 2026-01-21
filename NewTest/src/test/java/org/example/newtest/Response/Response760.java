package org.example.newtest.Response;

public class Response760 {
    public static boolean test760(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 23 && age <= 25
                && salary >= 35000 && salary <= 44000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Александр"
Age: от 23 до 25
Salary: от 35000 руб до 44000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 7 лет*/