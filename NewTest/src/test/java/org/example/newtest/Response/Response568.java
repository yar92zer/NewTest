package org.example.newtest.Response;

public class Response568 {
    public static boolean test568(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 28 && age <= 61
                && salary >= 39000 && salary <= 50000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 28 до 61
Salary: от 39000 руб до 50000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 3 года*/