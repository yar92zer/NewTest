package org.example.newtest.Response;

public class Response633 {
    public static boolean test633(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 25 && age <= 26
                && salary >= 20000 && salary <= 42000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 25 до 26
Salary: от 20000 руб до 42000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 5 лет*/