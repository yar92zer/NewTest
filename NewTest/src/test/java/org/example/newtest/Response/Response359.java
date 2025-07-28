package org.example.newtest.Response;

public class Response359 {
    public static boolean test359(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 24 && age <= 27
                && salary >= 31000 && salary <= 33000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 24 до 27
Salary: от 31000 руб до 33000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 5 лет*/