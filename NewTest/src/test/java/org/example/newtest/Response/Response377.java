package org.example.newtest.Response;

public class Response377 {
    public static boolean test377(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 27 && age <= 43
                && salary >= 26000 && salary <= 40000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Женский")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 27 до 43
Salary: от 26000 руб до 40000 руб
Country: "Италия"
Gender: "Женский"
Experience: 14 лет*/