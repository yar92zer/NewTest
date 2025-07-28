package org.example.newtest.Response;

public class Response482 {
    public static boolean test482(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталия")
                && age >= 24 && age <= 25
                && salary >= 33000 && salary <= 40000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 24 до 25
Salary: от 33000 руб до 40000 руб
Country: "Италия"
Gender: "Женский"
Experience: 2 года*/