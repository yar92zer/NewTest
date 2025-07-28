package org.example.newtest.Response;

public class Response77 {
    public static boolean test77(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 32 && age <= 38
                && salary >= 31000 && salary <= 55000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 32 до 38
Salary: от 31000 руб до 55000 руб
Country: "Франция"
Gender: "Женский"
Experience: 3 года*/