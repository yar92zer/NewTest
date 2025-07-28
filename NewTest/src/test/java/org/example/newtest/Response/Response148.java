package org.example.newtest.Response;

public class Response148 {
    public static boolean test148(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 20 && age <= 28
                && salary >= 46000 && salary <= 58000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 20 до 28
Salary: от 46000 руб до 58000 руб
Country: "Италия"
Gender: "Женский"
Experience: 7 лет*/