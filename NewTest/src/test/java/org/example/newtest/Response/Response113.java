package org.example.newtest.Response;

public class Response113 {
    public static boolean test113(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 43 && age <= 50
                && salary >= 44000 && salary <= 48000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 43 до 50
Salary: от 44000 руб до 48000 руб
Country: "Германия"
Gender: "Женский"
Experience: 12 лет*/