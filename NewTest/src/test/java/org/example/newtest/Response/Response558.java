package org.example.newtest.Response;

public class Response558 {
    public static boolean test558(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Сергей")
                && age >= 44 && age <= 63
                && salary >= 26000 && salary <= 38000
                && country.equalsIgnoreCase("Германия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Сергей"
Age: от 44 до 63
Salary: от 26000 руб до 38000 руб
Country: "Германия"
Gender: "Мужской"
Experience: 9 лет*/