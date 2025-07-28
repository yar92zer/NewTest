package org.example.newtest.Response;

public class Response437 {
    public static boolean test437(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 24 && age <= 26
                && salary >= 21000 && salary <= 30000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 24 до 26
Salary: от 21000 руб до 30000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 7 лет*/