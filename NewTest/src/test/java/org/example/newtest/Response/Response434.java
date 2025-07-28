package org.example.newtest.Response;

public class Response434 {
    public static boolean test434(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 30 && age <= 31
                && salary >= 43000 && salary <= 59000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 12) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 30 до 31
Salary: от 43000 руб до 59000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 12 лет*/