package org.example.newtest.Response;

public class Response88 {
    public static boolean test88(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 20 && age <= 31
                && salary >= 36000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 20 до 31
Salary: от 36000 руб до 48000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 11 лет*/