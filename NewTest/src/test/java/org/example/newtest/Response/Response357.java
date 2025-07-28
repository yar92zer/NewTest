package org.example.newtest.Response;

public class Response357 {
    public static boolean test357(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 38 && age <= 40
                && salary >= 38 && salary <= 40
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 38 до 40
Salary: от 32000 руб до 38000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 11 лет*/