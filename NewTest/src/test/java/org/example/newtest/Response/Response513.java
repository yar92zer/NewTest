package org.example.newtest.Response;

public class Response513 {
    public static boolean test513(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 28 && age <= 44
                && salary >= 22000 && salary <= 33000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*2Name: "Егор"
Age: от 28 до 44
Salary: от 22000 руб до 33000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 2 года*/