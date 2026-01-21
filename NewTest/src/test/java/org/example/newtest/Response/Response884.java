package org.example.newtest.Response;

public class Response884 {
    public static boolean test884(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 55 && age <= 62
                && salary >= 33000 && salary <= 34000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10;
    }
}
/*Name: "Дмитрий"
Age: от 55 до 62
Salary: от 33000 руб до 34000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 10 лет*/