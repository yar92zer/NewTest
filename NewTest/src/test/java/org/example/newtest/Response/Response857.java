package org.example.newtest.Response;

public class Response857 {
    public static boolean test857(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 27 && age <= 36
                && salary >= 43000 && salary <= 56000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Николай"
Age: от 27 до 36
Salary: от 43000 руб до 56000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 14 лет*/