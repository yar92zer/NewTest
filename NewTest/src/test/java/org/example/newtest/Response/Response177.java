package org.example.newtest.Response;

public class Response177 {
    public static boolean test177(String name, int age, int salary, String country, String gender, int experinece) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 55 && age <= 57
                && salary >= 30000 && salary <= 53000
                && country.equalsIgnoreCase("Польша")
                && gender.equalsIgnoreCase("Мужской")
                && experinece == 10) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 55 до 57
Salary: от 30000 руб до 53000 руб
Country: "Польша"
Gender: "Мужской"
Experience: 10 лет*/