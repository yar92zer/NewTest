package org.example.newtest.Response;

public class Response590 {
    public static boolean test590(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 34 && age <= 45
                && salary >= 22000 && salary <= 23000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 34 до 45
Salary: от 22000 руб до 23000 руб
Country: "Польша"
Gender: "Женский"
Experience: 5 лет*/