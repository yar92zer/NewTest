package org.example.newtest.Response;

public class Response80 {
    public static boolean test80(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 21 && age <= 36
                && salary >= 34000 && salary <= 46000
                && country.equalsIgnoreCase("Мужской")
                && experience == 11) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 21 до 36
Salary: от 34000 руб до 46000 руб
Country: "Италия"
Gender: "Мужской"
Experience: 11 лет*/