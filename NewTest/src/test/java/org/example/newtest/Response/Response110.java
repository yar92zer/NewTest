package org.example.newtest.Response;

public class Response110 {
    public static boolean test110(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 28 && age <= 30
                && salary > 34000 && salary <= 52000
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 10) {
            return true;
        }
        return false;

    }
}
/*Name: "Екатерина"
Age: от 28 до 46
Salary: от 34000 руб до 52000 руб
Country: "Чехия"
Gender: "Женский"
Experience: 10 лет*/