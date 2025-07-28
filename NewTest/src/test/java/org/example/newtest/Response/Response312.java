package org.example.newtest.Response;

public class Response312 {
    public static boolean test312(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 32 && age <= 43
                && salary >= 41000 && salary <= 43000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 32 до 43
Salary: от 41000 руб до 43000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 14 лет*/