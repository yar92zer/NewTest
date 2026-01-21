package org.example.newtest.Response;

public class Response837 {
    public static boolean test837(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Михаил")
                && age >= 20 && age <= 30
                && salary >= 41000 && salary <= 52000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 4;
    }
}
/*Name: "Михаил"
Age: от 20 до 30
Salary: от 41000 руб до 52000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 4 года*/