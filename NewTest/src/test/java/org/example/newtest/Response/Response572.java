package org.example.newtest.Response;

public class Response572 {
    public static boolean test572(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 53 && age <= 56
                && salary >= 21000 && salary <= 26000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 53 до 56
Salary: от 21000 руб до 26000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 14 лет*/