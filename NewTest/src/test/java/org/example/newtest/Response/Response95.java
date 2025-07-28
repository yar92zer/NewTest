package org.example.newtest.Response;

public class Response95 {
    public static boolean test95(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 27 && age <= 27
                && salary >= 43000 && salary <= 53000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 27 до 27
Salary: от 43000 руб до 53000 руб
Country: "Польша"
Gender: "Женский"
Experience: 3 года*/