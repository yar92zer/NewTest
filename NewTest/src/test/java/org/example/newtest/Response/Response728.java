package org.example.newtest.Response;

public class Response728 {
    public static boolean test728(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 27 && age <= 40
                && salary >= 44000 && salary <= 54000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7;
    }
}
/*Name: "Иван"
Age: от 27 до 40
Salary: от 44000 руб до 54000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 7 лет*/