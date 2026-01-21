package org.example.newtest.Response;

public class Response710 {
    public static boolean test710(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 28 && age <= 30
                && salary >= 37000 && salary <= 40000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Дмитрий"
Age: от 28 до 30
Salary: от 37000 руб до 40000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 10 лет*/