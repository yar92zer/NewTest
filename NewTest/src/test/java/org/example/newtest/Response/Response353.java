package org.example.newtest.Response;

public class Response353 {
    public static boolean test353(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 21 && age <= 40
                && salary >= 49000 && salary <= 56000
                && country.equalsIgnoreCase("Испания")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 21 до 40
Salary: от 49000 руб до 56000 руб
Country: "Испания"
Gender: "Мужской"
Experience: 6 лет*/