package org.example.newtest.Response;

public class Response537 {
    public static boolean test537(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 26 && age <= 28
                && salary >= 30000 && salary <= 42000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 26 до 28
Salary: от 30000 руб до 42000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 2 года*/