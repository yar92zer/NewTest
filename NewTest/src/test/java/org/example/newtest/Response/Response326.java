package org.example.newtest.Response;

public class Response326 {
    public static boolean test326(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 25 && age <= 28
                && salary >= 67000 && salary <= 70000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 25 до 28
Salary: от 67000 руб до 70000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 1 год*/