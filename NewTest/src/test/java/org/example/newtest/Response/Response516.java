package org.example.newtest.Response;

public class Response516 {
    public static boolean test516(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 54 && age <= 56
                && salary >= 44000 && salary <= 53000
                && country.equalsIgnoreCase("Венгрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 54 до 56
Salary: от 44000 руб до 53000 руб
Country: "Венгрия"
Gender: "Женский"
Experience: 12 лет*/