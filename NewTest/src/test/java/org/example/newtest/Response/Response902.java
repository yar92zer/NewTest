package org.example.newtest.Response;

public class Response902 {
    public static boolean test902(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Иван")
                && age >= 20 && age <= 30
                && salary >= 30000 && salary <= 66000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Иван"
Age: от 20 до 30
Salary: от 30000 руб до 66000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 10 лет*/