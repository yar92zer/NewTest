package org.example.newtest.Response;

public class Response722 {
    public static boolean test722(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 37 && age <= 38
                && salary >= 31000 && salary <= 55000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Дмитрий"
Age: от 37 до 38
Salary: от 31000 руб до 55000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 12 лет*/