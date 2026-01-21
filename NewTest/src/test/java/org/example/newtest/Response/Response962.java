package org.example.newtest.Response;

public class Response962 {
    public static boolean test962(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 43 && age <= 50
                && salary >= 28000 && salary <= 58000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Юлия"
Age: от 43 до 50
Salary: от 28000 руб до 58000 руб
Country: "Франция"
Gender: "Женский"
Experience: 9 лет*/