package org.example.newtest.Response;

public class Response768 {
    public static boolean test768(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 20 && age <= 33
                && salary >= 22000 && salary <= 26000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 1;
    }
}
/*Name: "Екатерина"
Age: от 20 до 33
Salary: от 22000 руб до 26000 руб
Country: "Италия"
Gender: "Женский"
Experience: 1 год*/