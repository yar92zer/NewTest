package org.example.newtest.Response;

public class Response74 {
    public static boolean test74(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Юлия")
                && age >= 19 && age <= 21
                && salary >= 32000 && salary <= 37000
                && country.equalsIgnoreCase("Бельгия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 2) {
            return true;
        }
        return false;
    }
}
/*Name: "Юлия"
Age: от 19 до 21
Salary: от 32000 руб до 37000 руб
Country: "Бельгия"
Gender: "Женский"
Experience: 2 года*/