package org.example.newtest.Response;

public class Response352 {
    public static boolean test352(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 21 && age <= 23
                && salary >= 25000 && salary <= 39000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 21 до 23
Salary: от 25000 руб до 39000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 5 лет*/