package org.example.newtest.Response;

public class Response132 {
    public static boolean test132(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 25 && age <= 36
                && salary >= 21000 && salary <= 29000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 25 до 36
Salary: от 21000 руб до 29000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 3 года*/