package org.example.newtest.Response;

public class Response998 {
    public static boolean test998(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 23 && age <= 42
                && salary >= 38000 && salary <= 40000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Дмитрий"
Age: от 23 до 42
Salary: от 38000 руб до 40000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 4 года*/