package org.example.newtest.Response;

public class Response745 {
    public static boolean test745(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 36 && age <= 37
                && salary >= 25000 && salary <= 29000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}

/*Name: "Артем"
Age: от 36 до 37
Salary: от 25000 руб до 29000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 10 лет*/