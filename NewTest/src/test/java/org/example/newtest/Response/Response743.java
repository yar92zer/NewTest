package org.example.newtest.Response;

public class Response743 {
    public static boolean test743(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 31 && age <= 34
                && salary >= 51000 && salary <= 64000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6;
    }
}
/*Name: "Артем"
Age: от 31 до 34
Salary: от 51000 руб до 64000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 6 лет*/