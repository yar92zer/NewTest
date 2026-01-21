package org.example.newtest.Response;

public class Response839 {
    public static boolean test839(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 32 && age <= 60
                && salary >= 30000 && salary <= 32000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Дмитрий"
Age: от 32 до 60
Salary: от 30000 руб до 32000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 12 лет*/