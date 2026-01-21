package org.example.newtest.Response;

public class Response560 {
    public static boolean test560(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Александр")
                && age >= 36 && age <= 40
                && salary >= 27000 && salary <= 47000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Александр"
Age: от 36 до 40
Salary: от 27000 руб до 47000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 8 лет*/