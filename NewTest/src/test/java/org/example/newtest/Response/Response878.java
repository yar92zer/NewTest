package org.example.newtest.Response;

public class Response878 {
    public static boolean test878(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 30 && age <= 31
                && salary >= 58000 && salary <= 69000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2;
    }
}
/*Name: "Алина"
Age: от 30 до 31
Salary: от 58000 руб до 69000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/