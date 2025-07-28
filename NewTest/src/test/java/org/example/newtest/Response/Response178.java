package org.example.newtest.Response;

public class Response178 {
    public static boolean test178(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 36 && age <= 53
                && salary >= 23000 && salary <= 54000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 36 до 53
Salary: от 23000 руб до 54000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 10 лет*/