package org.example.newtest.Response;

public class Response950 {
    public static boolean test950(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Алина")
                && age >= 36 && age <= 44
                && salary >= 30000 && salary <= 42000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Алина"
Age: от 36 до 44
Salary: от 30000 руб до 42000 руб
Country: "Франция"
Gender: "Женский"
Experience: 10 лет*/