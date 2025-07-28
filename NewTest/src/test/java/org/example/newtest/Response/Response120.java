package org.example.newtest.Response;

public class Response120 {
    public static boolean test120(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 20 && age <= 22
                && salary >= 29000 && salary <= 32000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 20 до 22
Salary: от 29000 руб до 32000 руб
Country: "Германия"
Gender: "Женский"
Experience: 3 года*/