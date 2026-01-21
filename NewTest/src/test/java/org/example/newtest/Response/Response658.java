package org.example.newtest.Response;

public class Response658 {
    public static boolean test658(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Андрей")
                && age >= 21 && age <= 23
                && salary >= 48000 && salary <= 58000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Андрей"
Age: от 21 до 23
Salary: от 48000 руб до 58000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 3 года*/