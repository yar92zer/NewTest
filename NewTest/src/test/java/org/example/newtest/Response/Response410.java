package org.example.newtest.Response;

public class Response410 {
    public static boolean test410(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 24 && age <= 30
                && salary >= 46000 && salary <= 47000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 8) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 24 до 30
Salary: от 46000 руб до 47000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 8 лет*/