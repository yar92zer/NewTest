package org.example.newtest.Response;

public class Response798 {
    public static boolean test(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 31 && age <= 32
                && salary >= 28000 && salary <= 32000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12;
    }
}
/*Name: "Дмитрий"
Age: от 31 до 32
Salary: от 28000 руб до 32000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 12 лет*/