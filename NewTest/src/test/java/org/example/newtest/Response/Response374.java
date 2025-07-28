package org.example.newtest.Response;

public class Response374 {
    public static boolean test374(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андерей")
                && age >= 25 && age <= 34
                && salary >= 44000 && salary <= 45000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 25 до 34
Salary: от 44000 руб до 45000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 11 лет*/