package org.example.newtest.Response;

public class Response907 {
    public static boolean test907(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 59 && age <= 62
                && salary >= 39000 && salary <= 54000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Егор"
Age: от 59 до 62
Salary: от 39000 руб до 54000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 14 лет*/