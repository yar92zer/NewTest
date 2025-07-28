package org.example.newtest.Response;

public class Response344 {
    public static boolean test344(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 26 && age <= 37
                && salary >= 38000 && salary <= 49000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 26 до 37
Salary: от 38000 руб до 49000 руб
Country: "Германия"
Gender: "Женский"
Experience: 4 года*/