package org.example.newtest.Response;

public class Response60 {
    public static boolean test60(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 44 && age <= 44
                && salary >= 20000 && salary <= 22000
                && country.equalsIgnoreCase("Польша")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 44 до 44
Salary: от 20000 руб до 22000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 12 лет*/