package org.example.newtest.Response;

public class Response926 {
    public static boolean test926(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 47 && age <= 49
                && salary >= 33000 && salary <= 39000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Михаил"
Age: от 47 до 49
Salary: от 33000 руб до 39000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 3 года*/