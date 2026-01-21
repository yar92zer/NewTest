package org.example.newtest.Response;

public class Response706 {
    public static boolean test706(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 20 && age <= 24
                && salary >= 37000 && salary <= 38000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Дмитрий"
Age: от 20 до 24
Salary: от 37000 руб до 38000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 4 года*/