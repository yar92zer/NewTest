package org.example.newtest.Response;

public class Response845 {
    public static boolean test845(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 33 && age <= 34
                && salary >= 22000 && salary <= 40000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Екатерина"
Age: от 33 до 34
Salary: от 22000 руб до 40000 руб
Country: "Италия"
Gender: "Женский"
Experience: 7 лет*/