package org.example.newtest.Response;

public class Response107 {
    public static boolean test107(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Михаил")
                && age >= 22 && age <= 47
                && salary >= 35000 && salary <= 35001
                && country.equalsIgnoreCase("Чехия")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 13) {
            return true;
        }
        return false;
    }
}
/*Name: "Михаил"
Age: от 22 до 47
Salary: от 35000 руб до 35001 руб
Country: "Чехия"
Gender: "Мужской"
Experience: 13 лет*/