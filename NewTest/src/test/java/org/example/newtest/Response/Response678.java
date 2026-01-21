package org.example.newtest.Response;

public class Response678 {
    public static boolean test678(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 43 && age <= 46
                && salary >= 22000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Елизавета"
Age: от 43 до 46
Salary: от 22000 руб до 48000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 7 лет*/