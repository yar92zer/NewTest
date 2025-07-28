package org.example.newtest.Response;

public class Response182 {
    public static boolean test182(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 34 && age <= 44
                && salary >= 45000 && salary <= 51000
                && gender.equalsIgnoreCase("Мужской")
                && country.equalsIgnoreCase("Италия")
                && experience == 1) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 34 до 40
Salary: от 45000 руб до 51000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 1 год*/