package org.example.newtest.Response;

public class Response741 {
    public static boolean test741(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 24 && age <= 41
                && salary >= 20000 && salary <= 21000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Дмитрий"
Age: от 24 до 41
Salary: от 20000 руб до 21000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 4 года*/