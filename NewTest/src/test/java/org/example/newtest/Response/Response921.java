package org.example.newtest.Response;

public class Response921 {
    public static boolean test921(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 25 && age <= 28
                && salary >= 58000 && salary <= 68000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Юлия"
Age: от 25 до 28
Salary: от 58000 руб до 68000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 1 год*/