package org.example.newtest.Response;

public class Response55 {
    public static boolean test55(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Виктория")
                && age >= 24 && age <= 26
                && salary >= 39000 && salary <= 59000
                && gender.equalsIgnoreCase("Женский")
                && country.equalsIgnoreCase("Германия")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 24 до 26
Salary: от 39000 руб до 59000 руб
Country: "Германия"
Gender: "Женский"
Experience: 2 года*/