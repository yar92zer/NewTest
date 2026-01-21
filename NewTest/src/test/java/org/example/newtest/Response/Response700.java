package org.example.newtest.Response;

public class Response700 {
    public static boolean test700(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 23 && age <= 25
                && salary >= 23 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Елизавета"
Age: от 23 до 25
Salary: от 47000 руб до 48000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 3 года*/