package org.example.newtest.Response;

public class Response450 {
    public static boolean test450(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 19 && age <= 24
                && salary >= 51000 && salary <= 54000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 19 до 24
Salary: от 51000 руб до 54000 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 6 лет*/