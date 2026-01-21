package org.example.newtest.Response;

public class Response624 {
    public static boolean test624(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 29 && age <= 36
                && salary >= 40000 && salary <= 44000
                && country.equalsIgnoreCase("Австрия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 29 до 36
Salary: от 40000 руб до 44000 руб
Country: "Австрия"
Gender: "Женский"
Experience: 11 лет*/