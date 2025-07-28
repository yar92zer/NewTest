package org.example.newtest.Response;

public class Response70 {
    public static boolean test70(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Светлана")
                && age >= 24 && age <= 53
                && salary >= 43000 && salary <= 62000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Светлана"
Age: от 24 до 53
Salary: от 43000 руб до 62000 руб
Country: "Франция"
Gender: "Женский"
Experience: 7 лет*/