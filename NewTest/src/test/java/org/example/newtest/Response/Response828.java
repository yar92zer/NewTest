package org.example.newtest.Response;

public class Response828 {
    public static boolean test828(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 21 && age <= 37
                && salary >= 27000 && salary <= 32000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8;
    }
}
/*Name: "Дмитрий"
Age: от 21 до 37
Salary: от 27000 руб до 32000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 8 лет*/