package org.example.newtest.Response;

public class Response554 {
    public static boolean test554(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктор")
                && age >= 38 && age <= 39
                && salary >= 21000 && salary <= 48000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 38 до 39
Salary: от 21000 руб до 48000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 5 лет*/