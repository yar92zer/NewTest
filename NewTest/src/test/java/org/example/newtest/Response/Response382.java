package org.example.newtest.Response;

public class Response382 {
    public static boolean test382(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 36 && age <= 46
                && salary >= 22000 && salary <= 36000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 36 до 46
Salary: от 22000 руб до 36000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 6 лет*/