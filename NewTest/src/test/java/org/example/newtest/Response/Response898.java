package org.example.newtest.Response;

public class Response898 {
    public static boolean test898(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 36 && age <= 37
                && salary >= 30000 && salary <= 44000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Екатерина"
Age: от 36 до 37
Salary: от 30000 руб до 44000 руб
Country: "Италия"
Gender: "Женский"
Experience: 6 лет*/