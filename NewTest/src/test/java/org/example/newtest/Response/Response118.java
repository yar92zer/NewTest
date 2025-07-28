package org.example.newtest.Response;

public class Response118 {
    public static boolean test1118(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 20 && age <= 24
                && salary >= 27000 && salary <= 29000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 20 до 24
Salary: от 27000 руб до 29000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 2 года*/