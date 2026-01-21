package org.example.newtest.Response;

public class Response679 {
    public static boolean test679(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 19 && age <= 20
                && salary >= 31000 && salary <= 35000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1;
    }
}
/*Name: "Егор"
Age: от 19 до 20
Salary: от 31000 руб до 35000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/