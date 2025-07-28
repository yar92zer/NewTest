package org.example.newtest.Response;

public class Response408 {
    public static boolean test409(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 38 && age <= 45
                && salary >= 39000 && salary <= 49000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 38 до 45
Salary: от 39000 руб до 49000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 13 лет*/