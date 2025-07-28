package org.example.newtest.Response;

public class Response448 {
    public static boolean test448(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 25 && age <= 33
                && salary >= 41000 && salary <= 53000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 25 до 33
Salary: от 41000 руб до 53000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 11 лет*/