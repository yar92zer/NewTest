package org.example.newtest.Response;

public class Response747 {
    public static boolean test747(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 42 && age <= 57
                && salary >= 27000 && salary <= 28000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6;
    }
}
/*Name: "Алина"
Age: от 42 до 57
Salary: от 27000 руб до 28000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 6 лет*/