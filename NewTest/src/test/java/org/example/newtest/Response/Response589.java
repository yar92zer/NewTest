package org.example.newtest.Response;

public class Response589 {
    public static boolean test589(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 29 && age <= 35
                && salary >= 39000 && salary <= 48000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 29 до 35
Salary: от 39000 руб до 48000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 5 лет*/