package org.example.newtest.Response;

public class Response797 {
    public static boolean test797(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Дмитрий")
                && age >= 18 && age <= 26
                && salary >= 37000 && salary <= 38000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Дмитрий"
Age: от 18 до 26
Salary: от 37000 руб до 38000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 2 года*/