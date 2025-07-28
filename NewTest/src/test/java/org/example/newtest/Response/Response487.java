package org.example.newtest.Response;

public class Response487 {
    public static boolean test487(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 21 && age <= 24
                && salary >= 21000 && salary <= 27000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 21 до 24
Salary: от 21000 руб до 27000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 2 года*/