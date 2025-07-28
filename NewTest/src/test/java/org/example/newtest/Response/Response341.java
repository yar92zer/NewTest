package org.example.newtest.Response;

public class Response341 {
    public static boolean test341(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 29 && age <= 30
                && salary >= 52000 && salary <= 55000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 29 до 30
Salary: от 52000 руб до 55000 руб
Country: "Германия"
Gender: "Женский"
Experience: 6 лет*/