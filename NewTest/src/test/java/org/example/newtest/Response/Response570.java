package org.example.newtest.Response;

public class Response570 {
    public static boolean test570(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 30 && age <= 60
                && salary >= 49000 && salary <= 55000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 30 до 60
Salary: от 49000 руб до 55000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 11 лет*/