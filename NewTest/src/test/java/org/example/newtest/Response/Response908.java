package org.example.newtest.Response;

public class Response908 {
    public static boolean test908(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 39 && age <= 51
                && salary >= 31000 && salary <= 35000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Сергей"
Age: от 39 до 51
Salary: от 31000 руб до 35000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 13 лет*/