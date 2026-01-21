package org.example.newtest.Response;

public class Response945 {
    public static boolean test945(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 28 && age <= 35
                && salary >= 37000 && salary <= 47000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Артем"
Age: от 28 до 35
Salary: от 37000 руб до 47000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 3 года*/