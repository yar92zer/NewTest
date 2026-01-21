package org.example.newtest.Response;

public class Response756 {
    public static boolean test756(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 20 && age <= 27
                && salary >= 22000 && salary <= 25000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6;
    }
}
/*Name: "Николай"
Age: от 20 до 27
Salary: от 22000 руб до 25000 руб
Country: "Бельгия"
Gender: "Мужской"
Experience: 6 лет*/