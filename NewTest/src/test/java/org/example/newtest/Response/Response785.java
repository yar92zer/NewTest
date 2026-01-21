package org.example.newtest.Response;

public class Response785 {
    public static boolean test785(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 58 && age <= 59
                && salary >= 25000 && salary <= 31000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10;
    }
}
/*Name: "Елизавета"
Age: от 58 до 59
Salary: от 25000 руб до 31000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 10 лет*/