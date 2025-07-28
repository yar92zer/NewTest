package org.example.newtest.Response;

public class Response51 {
    public static boolean test51(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 24 && age <= 28
                && salary >= 23000 && salary <= 29000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 24 до 28
Salary: от 23000 руб до 29000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 2 года*/