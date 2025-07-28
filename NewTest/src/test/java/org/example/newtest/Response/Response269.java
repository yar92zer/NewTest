package org.example.newtest.Response;

public class Response269 {
    public static boolean test269(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 19 && age <= 27
                && salary >= 25000 && salary <= 49000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 19 до 27
Salary: от 25000 руб до 49000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 5 лет*/