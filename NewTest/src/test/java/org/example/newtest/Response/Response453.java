package org.example.newtest.Response;

public class Response453 {
    public static boolean test453(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 41 && age <= 44
                && salary >= 36000 && salary <= 42000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 41 до 44
Salary: от 36000 руб до 42000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 10 лет*/