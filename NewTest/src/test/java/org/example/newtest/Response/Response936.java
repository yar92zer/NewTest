package org.example.newtest.Response;

public class Response936 {
    public static boolean test936(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 32 && age <= 34
                && salary >= 36000 && salary <= 40000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13;
    }
}
/*Name: "Михаил"
Age: от 32 до 34
Salary: от 36000 руб до 40000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 13 лет*/