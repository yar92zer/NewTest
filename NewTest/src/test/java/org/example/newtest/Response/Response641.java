package org.example.newtest.Response;

public class Response641 {
    public static boolean test641(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Артем")
                && age >= 19 && age <= 24
                && salary >= 26000 && salary <= 32000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Артем"
Age: от 19 до 24
Salary: от 26000 руб до 32000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 1 год*/