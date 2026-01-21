package org.example.newtest.Response;

public class Response585 {
    public static boolean test585(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 19 && age <= 31
                && salary >= 63000 && salary <= 67000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 19 до 31
Salary: от 63000 руб до 67000 руб
Country: "Польша"
Gender: "Женский"
Experience: 5 лет*/