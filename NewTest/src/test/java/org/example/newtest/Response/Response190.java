package org.example.newtest.Response;

public class Response190 {
    public static boolean test190(String name, int age, int salary, String country, String gender, int expeience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 26 && age <= 30
                && salary >= 24000 && salary <= 33000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && expeience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 26 до 30
Salary: от 24000 руб до 33000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 6 лет*/