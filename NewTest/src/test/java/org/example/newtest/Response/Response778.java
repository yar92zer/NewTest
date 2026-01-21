package org.example.newtest.Response;

public class Response778 {
    public static boolean test778(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Оксана")
                && age >= 22 && age <= 23
                && salary >= 21000 && salary <= 39000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 4;
    }
}
/*Name: "Оксана"
Age: от 22 до 23
Salary: от 21000 руб до 39000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 4 года*/