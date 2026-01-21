package org.example.newtest.Response;

public class Response744 {
    public static boolean test744(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 31 && age <= 39
                && salary >= 38000 && salary <= 45000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Александр"
Age: от 31 до 39
Salary: от 38000 руб до 45000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 3 года*/