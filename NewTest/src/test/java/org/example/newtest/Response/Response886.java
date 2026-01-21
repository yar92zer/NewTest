package org.example.newtest.Response;

public class Response886 {
    public static boolean test886(String name, int age, int salary, String gender, String country, int experience) {
        return name.toLowerCase().startsWith("Николай")
                && age >= 39 && age <= 55
                && salary >= 28000 && salary <= 32000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Николай"
Age: от 39 до 55
Salary: от 28000 руб до 32000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 8 лет*/