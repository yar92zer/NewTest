package org.example.newtest.Response;

public class Response86 {
    public static boolean test86(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 30 && age <= 45
                && salary >= 21000 && salary <= 62000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 30 до 45
Salary: от 21000 руб до 62000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 4 года*/