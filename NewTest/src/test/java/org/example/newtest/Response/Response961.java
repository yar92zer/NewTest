package org.example.newtest.Response;

public class Response961 {
    public static boolean test961(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 31 && age <= 32
                && salary >= 38000 && salary <= 44000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Алина"
Age: от 31 до 32
Salary: от 38000 руб до 44000 руб
Country: "Германия"
Gender: "Женский"
Experience: 10 лет*/