package org.example.newtest.Response;

public class Response525 {
    public static boolean test525(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 32 && age <= 33
                && salary >= 29000 && salary <= 34000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 32 до 33
Salary: от 29000 руб до 34000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 4 года*/