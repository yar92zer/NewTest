package org.example.newtest.Response;

public class Response843 {
    public static boolean test843(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Егор")
                && age >= 27 && age <= 42
                && salary >= 32000 && salary <= 34000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2;
    }
}
/*Name: "Егор"
Age: от 27 до 42
Salary: от 32000 руб до 34000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 2 года*/