package org.example.newtest.Response;

public class Response123 {
    public static boolean test123(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 25 && age <= 28
                && salary >= 22000 && salary <= 28000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 25 до 28
Salary: от 22000 руб до 28000 руб
Country: "Франция"
Gender: "Женский"
Experience: 2 года*/