package org.example.newtest.Response;

public class Response108 {
    public static boolean test108(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 28 && age <= 31
                && salary >= 39000 && salary <= 48000
                && gender.equalsIgnoreCase("Венгрия")
                && country.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 28 до 31
Salary: от 39000 руб до 48000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 5 лет*/