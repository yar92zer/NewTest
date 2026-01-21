package org.example.newtest.Response;

public class Response904 {
    public static boolean test904(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 44 && age <= 61
                && salary >= 35000 && salary <= 38000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15;
    }
}
/*Name: "Екатерина"
Age: от 44 до 61
Salary: от 35000 руб до 38000 руб
Country: "Германия"
Gender: "Женский"
Experience: 15 лет*/