package org.example.newtest.Response;

public class Response444 {
    public static boolean test444(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 28 && age <= 48
                && salary >= 40000 && salary <= 43000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 28 до 48
Salary: от 40000 руб до 43000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 13 лет*/