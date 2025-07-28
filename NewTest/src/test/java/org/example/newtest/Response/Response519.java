package org.example.newtest.Response;

public class Response519 {
    public static boolean test519(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизавета")
                && age >= 20 && age <= 23
                && salary >= 26000 && salary <= 36000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 20 до 23
Salary: от 26000 руб до 36000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 5 лет*/