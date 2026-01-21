package org.example.newtest.Response;

public class Response825 {
    public static boolean test825(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 28 && age <= 41
                && salary >= 20000 && salary <= 29000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Дмитрий"
Age: от 28 до 41
Salary: от 20000 руб до 29000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 14 лет*/