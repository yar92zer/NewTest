package org.example.newtest.Response;

public class Response265 {
    public static boolean test265(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 22 && age <= 30
                && salary >= 47000 && salary <= 55000
                && country.equalsIgnoreCase("Италия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 5) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 22 до 30
Salary: от 47000 руб до 55000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 5 лет*/