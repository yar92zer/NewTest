package org.example.newtest.Response;

public class Response474 {
    public static boolean test474(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 30 && age <= 35
                && salary >= 45000 && salary <= 49000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 30 до 35
Salary: от 45000 руб до 49000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 2 года*/