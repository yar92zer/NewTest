package org.example.newtest.Response;

public class Response834 {
    public static boolean test834(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 39 && age <= 41
                && salary >= 26000 && salary <= 60000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13;
    }
}
/*Name: "Юлия"
Age: от 39 до 41
Salary: от 26000 руб до 60000 руб
Country: "Италия"
Gender: "Женский"
Experience: 13 лет*/