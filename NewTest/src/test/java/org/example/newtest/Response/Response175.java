package org.example.newtest.Response;

public class Response175 {
    public static boolean test175(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 26 && age <= 29
                && salary >= 23000 && salary <= 33000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 26 до 29
Salary: от 23000 руб до 33000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 8 лет*/