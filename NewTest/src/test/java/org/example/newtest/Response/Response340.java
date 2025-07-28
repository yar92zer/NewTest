package org.example.newtest.Response;

public class Response340 {
    public static boolean test340(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Иван")
                && age >= 25 && age <= 34
                && salary >= 32000 && salary <= 35000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 15) {
            return true;
        }
        return false;
    }
}
/*Name: "Иван"
Age: от 25 до 34
Salary: от 32000 руб до 35000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 15 лет*/