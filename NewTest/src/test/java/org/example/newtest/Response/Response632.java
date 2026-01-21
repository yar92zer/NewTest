package org.example.newtest.Response;

public class Response632 {
    public static boolean test632(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Алина")
                && age >= 49 && age <= 50
                && salary >= 37000 && salary <= 43000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Алина"
Age: от 49 до 50
Salary: от 37000 руб до 43000 руб
Country: "Германия"
Gender: "Женский"
Experience: 12 лет*/