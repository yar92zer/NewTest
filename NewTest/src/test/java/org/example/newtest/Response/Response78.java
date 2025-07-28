package org.example.newtest.Response;

public class Response78 {
    public static boolean test78(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 44 && age <= 47
                && salary >= 25000 && salary <= 39000
                && country.equalsIgnoreCase("Исавнния")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 44 до 47
Salary: от 25000 руб до 39000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 8 лет*/