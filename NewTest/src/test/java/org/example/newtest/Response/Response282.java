package org.example.newtest.Response;

public class Response282 {
    public static boolean test282(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 18 && age <= 27
                && salary >= 50000 && salary <= 51000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 18 до 27
Salary: от 50000 руб до 51000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/