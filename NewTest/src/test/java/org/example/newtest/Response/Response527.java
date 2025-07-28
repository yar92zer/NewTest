package org.example.newtest.Response;

public class Response527 {
    public static boolean test527(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Екатерина")
                && age >= 24 && age <= 25
                && salary >= 52000 && salary <= 54000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Женский")
                && experience == 6) {
            return true;
        }
        return false;
    }
}
/*Name: "Екатерина"
Age: от 24 до 25
Salary: от 52000 руб до 54000 руб
Country: "Польша"
Gender: "Женский"
Experience: 6 лет*/