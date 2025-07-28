package org.example.newtest.Response;

public class Response386 {
    public static boolean test386(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 29 && age <= 36
                && salary >= 37000 && salary <= 48000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 29 до 36
Salary: от 37000 руб до 48000 руб
Country: "Германия"
Gender: "Женский"
Experience: 3 года*/