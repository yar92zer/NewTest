package org.example.newtest.Response;

public class Response737 {
    public static boolean test737(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Артем")
                && age >= 23 && age <= 27
                && salary >= 64000 && salary <= 67000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9;
    }
}
/*Name: "Артем"
Age: от 23 до 27
Salary: от 64000 руб до 67000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 9 лет*/