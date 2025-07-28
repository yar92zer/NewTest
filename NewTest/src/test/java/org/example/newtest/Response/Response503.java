package org.example.newtest.Response;

public class Response503 {
    public static boolean test503(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 38 && age <= 41
                && salary >= 20000 && salary <= 23000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 38 до 41
Salary: от 20000 руб до 23000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 11 лет*/