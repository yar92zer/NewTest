package org.example.newtest.Response;

public class Response736 {
    public static boolean test736(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 19 && age <= 42
                && salary >= 26000 && salary <= 28000
                && country.equalsIgnoreCase("Белград")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Иван"
Age: от 19 до 42
Salary: от 26000 руб до 28000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 14 лет*/