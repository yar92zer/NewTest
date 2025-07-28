package org.example.newtest.Response;

public class Response166 {
    public static boolean test166(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 43 && age <= 51
                && salary >= 44000 && salary <= 47000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 43 до 51
Salary: от 44000 руб до 47000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 12 лет*/