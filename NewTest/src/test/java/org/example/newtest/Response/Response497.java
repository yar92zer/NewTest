package org.example.newtest.Response;

public class Response497 {
    public static boolean test497(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Мария")
                && age >= 36 && age <= 53
                && salary >= 31000 && salary <= 39000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Мария"
Age: от 36 до 53
Salary: от 31000 руб до 39000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 15 лет*/