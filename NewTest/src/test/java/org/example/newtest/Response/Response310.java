package org.example.newtest.Response;

public class Response310 {
    public static boolean test310(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 40 && age <= 41
                && salary >= 31000 && salary <= 45000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 40 до 41
Salary: от 31000 руб до 45000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 7 лет*/