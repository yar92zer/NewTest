 package org.example.newtest.Response;

public class Response642 {
    public static boolean test642(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елизавета")
                && age >= 59 && age <= 60
                && salary >= 61000 && salary <= 64000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Елизавета"
Age: от 59 до 60
Salary: от 61000 руб до 64000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 2 года*/