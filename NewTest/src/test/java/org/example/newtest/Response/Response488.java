package org.example.newtest.Response;

public class Response488 {
    public static boolean test488(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Вктория")
                && age >= 53 && age <= 54
                && salary >= 24000 && salary <= 27000
                && country.equalsIgnoreCase("Виктор")
                && gender.equalsIgnoreCase("Женский")
                && experience == 9) {
            return true;
        }
        return false;
    }
}
/*Name: "Виктория"
Age: от 53 до 54
Salary: от 24000 руб до 27000 руб
Country: "Франция"
Gender: "Женский"
Experience: 9 лет*/