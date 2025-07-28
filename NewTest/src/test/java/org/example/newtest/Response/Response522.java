package org.example.newtest.Response;

public class Response522 {
    public static boolean test522(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Оксана")
                && age >= 21 && age <= 27
                && salary >= 22000 && salary <= 45000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Оксана"
Age: от 21 до 27
Salary: от 22000 руб до 45000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 9 лет*/