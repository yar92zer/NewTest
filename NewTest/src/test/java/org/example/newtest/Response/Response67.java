package org.example.newtest.Response;

public class Response67 {
    public static boolean test67(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 26 && age <= 27
                && salary >= 22000 && salary <= 66000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 26 до 27
Salary: от 22000 руб до 66000 руб
Country: "Италия"
Gender: "Женский"
Experience: 6 ле*/