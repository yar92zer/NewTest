package org.example.newtest.Response;

public class Response387 {
    public static boolean test387(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 19 && age <= 27
                && salary >= 69000 && salary <= 70000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 19 до 27
Salary: от 69000 руб до 70000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 7 лет*/