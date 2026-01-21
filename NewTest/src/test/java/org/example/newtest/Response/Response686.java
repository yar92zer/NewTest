package org.example.newtest.Response;

public class Response686 {
    public static boolean test686(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 46 && age <= 58
                && salary >= 31000 && salary <= 33000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Егор"
Age: от 46 до 58
Salary: от 31000 руб до 33000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 4 года*/