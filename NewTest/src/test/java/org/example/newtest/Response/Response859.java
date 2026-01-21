package org.example.newtest.Response;

public class Response859 {
    public static boolean test859(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Елизавета")
                && age >= 20 && age <= 25
                && salary >= 37000 && salary <= 41000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 5;
    }
}
/*Name: "Елизавета"
Age: от 20 до 25
Salary: от 37000 руб до 41000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 5 лет*/