package org.example.newtest.Response;

public class Response388 {
    public static boolean test388(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 21 && age <= 47
                && salary >= 41000 && salary <= 42000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 21 до 47
Salary: от 41000 руб до 42000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 8 лет*/