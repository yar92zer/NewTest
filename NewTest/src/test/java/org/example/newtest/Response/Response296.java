package org.example.newtest.Response;

public class Response296 {
    public static boolean test296(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 27 && age <= 28
                && salary >= 45000 && salary <= 47000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 27 до 28
Salary: от 45000 руб до 47000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 4 года*/