package org.example.newtest.Response;

public class Response523 {
    public static boolean test535(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 18 && age <= 27
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 18 до 27
Salary: от 27000 руб до 29000 руб
Country: "Италия"
Gender: "Женский"
Experience: 2 года*/