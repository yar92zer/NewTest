package org.example.newtest.Response;

public class Response707 {
    public static boolean test767(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 24 && age <= 26
                && salary >= 20000 && salary <= 39000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Андрей"
Age: от 24 до 26
Salary: от 20000 руб до 39000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 2 года*/