package org.example.newtest.Response;

public class Response539 {
    public static boolean test539(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 27 && age <= 38
                && salary >= 27000 && salary <= 44000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 27 до 38
Salary: от 27000 руб до 44000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 12 лет*/