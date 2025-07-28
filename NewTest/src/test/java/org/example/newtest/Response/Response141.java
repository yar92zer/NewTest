package org.example.newtest.Response;

public class Response141 {
    public static boolean test141(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 23 && age <= 31
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 23 до 31
Salary: от 26000 руб до 27000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 11 лет*/