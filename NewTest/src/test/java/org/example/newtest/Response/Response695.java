package org.example.newtest.Response;

public class Response695 {
    public static boolean test695(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Анна")
                && age >= 50 && age <= 52
                && salary >= 23000 && salary <= 28000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Анна"
Age: от 50 до 52
Salary: от 23000 руб до 28000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 10 лет*/