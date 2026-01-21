package org.example.newtest.Response;

public class Response882 {
    public static boolean test882(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 44 && age <= 45
                && salary >= 45000 && salary <= 48000
                && country.equalsIgnoreCase("Александр")
                && gender.equalsIgnoreCase("Италия")
                && experience == 13;
    }
}
/*Name: "Александр"
Age: от 44 до 45
Salary: от 45000 руб до 48000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 13 лет*/