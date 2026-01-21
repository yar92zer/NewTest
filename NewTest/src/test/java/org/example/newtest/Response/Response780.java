package org.example.newtest.Response;

public class Response780 {
    public static boolean test780(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 52 && age <= 62
                && salary >= 38000 && salary <= 43000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Дмитрий"
Age: от 52 до 62
Salary: от 38000 руб до 43000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 14 лет*/