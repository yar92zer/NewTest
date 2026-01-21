package org.example.newtest.Response;

public class Response731 {
    public static boolean test731(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Сергей")
                && age >= 18 && age <= 48
                && salary >= 18 && salary <= 36000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Сергей"
Age: от 18 до 48
Salary: от 31000 руб до 36000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 3 года*/