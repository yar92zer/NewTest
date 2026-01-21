package org.example.newtest.Response;

public class Response565 {
    public static boolean test565(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Дмитрий")
                && age >= 38 && age <= 39
                && salary >= 30000 && salary <= 41000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Дмитрий"
Age: от 38 до 39
Salary: от 30000 руб до 41000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 8 лет*/