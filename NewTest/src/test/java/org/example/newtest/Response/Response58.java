package org.example.newtest.Response;

public class Response58 {
    public static boolean test58(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 21 && age <= 22
                && salary >= 41000 && salary <= 61000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 21 до 22
Salary: от 41000 руб до 61000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 4 года*/