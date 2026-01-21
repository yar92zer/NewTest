package org.example.newtest.Response;

public class Response628 {
    public static boolean test628(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 21 && age <= 30
                && salary >= 37000 && salary <= 41000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 21 до 30
Salary: от 37000 руб до 41000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 9 лет*/