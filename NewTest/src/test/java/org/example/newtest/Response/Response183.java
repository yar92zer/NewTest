package org.example.newtest.Response;

public class Response183 {
    public static boolean test183(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 21 && age <= 29
                && salary >= 33000 && salary <= 45000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 21 до 29
Salary: от 33000 руб до 45000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 8 лет*/