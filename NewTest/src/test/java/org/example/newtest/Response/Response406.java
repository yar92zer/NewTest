package org.example.newtest.Response;

public class Response406 {
    public static boolean test406(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 45 && age <= 61
                && salary >= 21000 && salary <= 25000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 45 до 61
Salary: от 21000 руб до 25000 руб
Country: "Италия"
Gender: "Женский"
Experience: 12 лет*/