package org.example.newtest.Response;

public class Response347 {
    public static boolean test347(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 25000 && age <= 37000
                && salary >= 25000 && salary < 37000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 43 до 45
Salary: от 25000 руб до 37000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 1 год*/