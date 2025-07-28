package org.example.newtest.Response;

public class Response281 {
    public static boolean test281(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 22 && age <= 30
                && salary >= 29000 && salary <= 38000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 22 до 30
Salary: от 29000 руб до 38000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 11 лет*/