package org.example.newtest.Response;

public class Response989 {
    public static boolean test989(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Екатерина")
                && age >= 26 && age <= 27
                && salary >= 27000 && salary <= 28000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Екатерина"
Age: от 26 до 27
Salary: от 27000 руб до 28000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 6 лет*/