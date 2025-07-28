package org.example.newtest.Response;

public class Response117 {
    public static boolean test117(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 19 && age <= 35
                && salary >= 23000 && salary <= 25000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 19 до 35
Salary: от 23000 руб до 25000 руб
Country: "Австрия"
Gender: "Мужской"
Experience: 13 лет*/