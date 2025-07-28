package org.example.newtest.Response;

public class Response307 {
    public static boolean test307(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 22 && age <= 27
                && salary >= 44000 && salary <= 48000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 22 до 27
Salary: от 44000 руб до 48000 руб
Country: "Франция"
Gender: "Женский"
Experience: 9 лет*/