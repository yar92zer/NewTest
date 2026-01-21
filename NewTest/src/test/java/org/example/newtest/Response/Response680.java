package org.example.newtest.Response;

public class Response680 {
    public static boolean test680(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 45 && age <= 60
                && salary >= 20000 && salary <= 29000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7;
    }
}
/*Name: "Елизавета"
Age: от 45 до 60
Salary: от 20000 руб до 29000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 7 лет*/