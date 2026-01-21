package org.example.newtest.Response;

public class Response984 {
    public static boolean test984(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 39 && age <= 42
                && salary >= 26000 && salary <= 27000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14;
    }
}
/*Name: "Николай"
Age: от 39 до 42
Salary: от 26000 руб до 27000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 14 лет*/