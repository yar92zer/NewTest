package org.example.newtest.Response;

public class Response127 {
    public static boolean test127(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Андрей")
                && age >= 27 && age <= 30
                && salary >= 25000 && salary <= 28000
                && country.equalsIgnoreCase("Нидерланды")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 7) {
            return true;
        }
        return false;
    }
}
/*Name: "Андрей"
Age: от 27 до 30
Salary: от 25000 руб до 28000 руб
Country: "Нидерланды"
Gender: "Мужской"
Experience: 7 лет*/