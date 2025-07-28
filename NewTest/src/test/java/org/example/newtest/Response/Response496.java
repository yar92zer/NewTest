package org.example.newtest.Response;

public class Response496 {
    public static boolean test496(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 56 && age <= 61
                && salary >= 40000 && salary <= 49000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 56 до 61
Salary: от 40000 руб до 49000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 2 года*/