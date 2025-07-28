package org.example.newtest.Response;

public class Response53 {
    public static boolean test53(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 31 && age <= 45
                && salary >= 26000 && salary <= 26000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 31 до 45
Salary: от 26000 руб до 26000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 11 лет*/