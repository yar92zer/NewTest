package org.example.newtest.Response;

public class Response549 {
    public static boolean test549(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 19 && age <= 27
                && salary >= 22000 && salary <= 46000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 19 до 27
Salary: от 22000 руб до 46000 руб
Country: "Германия"
Gender: "Женский"
Experience: 8 лет*/