package org.example.newtest.Response;

public class Response682 {
    public static boolean test682(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 21 && age <= 24
                && salary >= 23000 && salary <= 38000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5;
    }
}
/*Name: "Артем"
Age: от 21 до 24
Salary: от 23000 руб до 38000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 5 лет*/