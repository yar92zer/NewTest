package org.example.newtest.Response;

public class Response196 {
    public static boolean test196(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 28 && age <= 31
                && salary >= 24000 && salary <= 25000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 28 до 31
Salary: от 24000 руб до 25000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 4 года*/