package org.example.newtest.Response;

public class Response711 {
    public static boolean test711(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 23 && age <= 27
                && salary >= 24000 && salary <= 27000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 3;
    }
}
/*Name: "Екатерина"
Age: от 23 до 27
Salary: от 24000 руб до 27000 руб
Country: "Италия"
Gender: "Женский"
Experience: 3 года*/