package org.example.newtest.Response;

public class Response394 {
    public static boolean test394(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Елена")
                && age >= 41 && age <= 47
                && salary >= 26000 && salary <= 29000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Женский")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Елена"
Age: от 41 до 47
Salary: от 26000 руб до 29000 руб
Country: "Франция"
Gender: "Женский"
Experience: 13 лет*/