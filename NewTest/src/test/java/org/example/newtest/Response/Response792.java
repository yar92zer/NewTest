package org.example.newtest.Response;

public class Response792 {
    public static boolean test792(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Юлия")
                && age >= 18 && age <= 20
                && salary >= 26000 && salary <= 28000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Юлия"
Age: от 18 до 20
Salary: от 26000 руб до 28000 руб
Country: "Франция"
Gender: "Женский"
Experience: 1 год*/