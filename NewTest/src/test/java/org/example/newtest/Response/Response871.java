package org.example.newtest.Response;

public class Response871 {
    public static boolean test871(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 25 && age <= 33
                && salary >= 41000 && salary <= 51000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Дмитрий"
Age: от 25 до 33
Salary: от 41000 руб до 51000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 11 лет*/