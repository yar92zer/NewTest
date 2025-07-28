package org.example.newtest.Response;

public class Response161 {
    public static boolean test161(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 31 && age <= 58
                && salary >= 22000 && salary <= 39000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 31 до 58
Salary: от 22000 руб до 39000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 8 лет*/