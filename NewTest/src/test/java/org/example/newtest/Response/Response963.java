package org.example.newtest.Response;

public class Response963 {
    public static boolean test963(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 24 && age <= 30
                && salary >= 38000 && salary <= 40000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Алина"
Age: от 24 до 30
Salary: от 38000 руб до 40000 руб
Country: "Германия"
Gender: "Женский"
Experience: 9 лет*/