package org.example.newtest.Response;

public class Response975 {
    public static boolean test975(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 29 && age <= 42
                && salary >= 33000 && salary <= 41000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Иван"
Age: от 29 до 42
Salary: от 33000 руб до 41000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 12 лет*/