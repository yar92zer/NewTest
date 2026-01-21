package org.example.newtest.Response;

public class Response553 {
    public static boolean test553(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 19 && age <= 49
                && salary >= 30000 && salary <= 31000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 19 до 49
Salary: от 30000 руб до 31000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 14 лет*/