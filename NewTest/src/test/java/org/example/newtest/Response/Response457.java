package org.example.newtest.Response;

public class Response457 {
    public static boolean test457(String name, int age, int salary, String country, String gender, int experience) {
        if (name.toLowerCase().startsWith("Николай")
                && age >= 52 && age <= 55
                && salary >= 21000 && salary <= 35000
                && country.equalsIgnoreCase("Франция")
                && gender.equalsIgnoreCase("Мужской")
                && experience == 14) {
            return true;
        }
        return false;
    }
}
/*Name: "Николай"
Age: от 52 до 55
Salary: от 21000 руб до 35000 руб
Country: "Франция"
Gender: "Мужской"
Experience: 14 лет*/