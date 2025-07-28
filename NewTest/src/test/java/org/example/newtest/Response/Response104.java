package org.example.newtest.Response;

public class Response104 {
    public static boolean test104(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Максим")
                && age >= 19 && age <= 21
                && salary >= 21000 && salary <= 23000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Максим"
Age: от 19 до 21
Salary: от 21000 руб до 23000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 1 год*/