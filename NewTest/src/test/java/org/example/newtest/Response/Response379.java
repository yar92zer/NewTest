package org.example.newtest.Response;

public class Response379 {
    public static boolean test379(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 29 && age <= 35
                && salary >= 23000 && salary <= 27000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 29 до 35
Salary: от 23000 руб до 27000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 9 лет*/