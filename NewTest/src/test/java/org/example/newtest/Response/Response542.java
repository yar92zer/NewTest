package org.example.newtest.Response;

public class Response542 {
    public static boolean test542(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 42 && age <= 45
                && salary >= 31000 && salary <= 33000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 42 до 45
Salary: от 31000 руб до 33000 руб
Country: "Франция"
Gender: "Женский"
Experience: 3 года*/