package org.example.newtest.Response;

public class Response580 {
    public static boolean test580(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 41 && age <= 44
                && salary >= 35000 && salary <= 37000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 41 до 44
Salary: от 35000 руб до 37000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 6 лет*/