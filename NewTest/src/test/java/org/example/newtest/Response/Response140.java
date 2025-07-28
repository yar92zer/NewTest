package org.example.newtest.Response;

public class Response140 {
    public static boolean test140(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 18 && age <= 20
                && salary >= 44000 && salary <= 61000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 18 до 20
Salary: от 44000 руб до 61000 руб
Country: "Италия"
Gender: "Женский"
Experience: 1 год*/