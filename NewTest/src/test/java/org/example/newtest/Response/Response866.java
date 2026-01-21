package org.example.newtest.Response;

public class Response866 {
    public static boolean test866(String name, int age, int salary, String country, String gender, int experience) {
        return name.toLowerCase().startsWith("Александр")
                && age >= 26 && age <= 29
                && salary >= 60000 && salary <= 63000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 3;
    }
}
/*Name: "Александр"
Age: от 26 до 29
Salary: от 60000 руб до 63000 руб
Country: "Венгрия"
Gender: "Мужской"
Experience: 3 года*/