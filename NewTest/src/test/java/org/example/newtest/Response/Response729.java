package org.example.newtest.Response;

public class Response729 {
    public static boolean test729(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 49 && age <= 53
                && salary >= 49000 && salary <= 50000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Артем"
Age: от 49 до 53
Salary: от 49000 руб до 50000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 8 лет*/