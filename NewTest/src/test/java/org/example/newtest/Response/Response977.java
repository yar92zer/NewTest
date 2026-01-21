package org.example.newtest.Response;

public class Response977 {
    public static boolean test977(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 28 && age <= 29
                && salary >= 35000 && salary <= 36000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11;
    }
}
/*Name: "Михаил"
Age: от 28 до 29
Salary: от 35000 руб до 36000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 11 лет*/