package org.example.newtest.Response;

public class Response532 {
    public static boolean test532(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Наталья")
                && age >= 41 && age <= 47
                && salary >= 57000 && salary <= 58000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Наталья"
Age: от 41 до 47
Salary: от 57000 руб до 58000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 7 лет*/