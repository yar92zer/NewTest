package org.example.newtest.Response;

public class Response131 {
    public static boolean test131(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 33 && age <= 39
                && salary >= 29000 && salary <= 39000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 33 до 39
Salary: от 29000 руб до 39000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 3 года*/