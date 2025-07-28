package org.example.newtest.Response;

public class Response508 {
    public static boolean test508(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 24 && age <= 26
                && salary >= 24000 && salary <= 28000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 24 до 26
Salary: от 24000 руб до 28000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 8 лет*/