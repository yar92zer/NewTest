package org.example.newtest.Response;

public class Response479 {
    public static boolean test479(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Ольга")
                && age >= 31 && age <= 53
                && salary >= 25000 && salary <= 43000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Ольга"
Age: от 31 до 53
Salary: от 25000 руб до 43000 руб
Country: "Франция"
Gender: "Женский"
Experience: 7 лет*/