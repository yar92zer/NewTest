package org.example.newtest.Response;

public class Response520 {
    public static boolean test520(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Егор")
                && age >= 33 && age <= 50
                && salary >= 20000 && salary <= 22000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Егор"
Age: от 33 до 50
Salary: от 20000 руб до 22000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 5 лет*/