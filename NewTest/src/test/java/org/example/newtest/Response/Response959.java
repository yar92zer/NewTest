package org.example.newtest.Response;

public class Response959 {
    public static boolean test959(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 20 && age <= 36
                && salary >= 34000 && salary <= 42000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Елизавета"
Age: от 20 до 36
Salary: от 34000 руб до 42000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 9 лет*/