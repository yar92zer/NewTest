package org.example.newtest.Response;

public class Response881 {
    public static boolean test881(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 28 && age <= 33
                && salary >= 33000 && salary <= 49000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9;
    }
}
/*Name: "Елизавета"
Age: от 28 до 33
Salary: от 33000 руб до 49000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 9 лет*/