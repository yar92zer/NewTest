package org.example.newtest.Response;

public class Response114 {
    public static boolean test114(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 29 && age <= 30
                && salary >= 27000 && salary <= 38000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 29 до 30
Salary: от 27000 руб до 38000 руб
Country: "Италия"
Gender: "Женский"
Experience: 1 год*/