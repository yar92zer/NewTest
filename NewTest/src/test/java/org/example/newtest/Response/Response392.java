package org.example.newtest.Response;

public class Response392 {
    public static boolean test392(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 42 && age <= 49
                && salary >= 25000 && salary <= 47000
                && gender.equalsIgnoreCase("Елена")
                && country.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 42 до 49
Salary: от 25000 руб до 47000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 8 лет*/