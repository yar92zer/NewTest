package org.example.newtest.Response;

public class Response360 {
    public static boolean test360(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 26 && age <= 32
                && salary >= 38000 && salary <= 44000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 26 до 32
Salary: от 38000 руб до 44000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 12 лет*/